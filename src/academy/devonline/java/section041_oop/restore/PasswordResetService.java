package academy.devonline.java.section041_oop.restore;


/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */

public final class PasswordResetService {

    private final AccountRepository accountRepository;
    private final AccountNotFoundByEmailHandler accountNotFoundByEmailHandler;
    private final AccountNotActiveHandler accountNotActiveHandler;
    private final VerificationCodeGenerator verificationCodeGenerator;
    private final EmailService emailService;

    public PasswordResetService(final AccountRepository accountRepository,
                                final AccountNotFoundByEmailHandler accountNotFoundByEmailHandler,
                                final AccountNotActiveHandler accountNotActiveHandler,
                                final VerificationCodeGenerator verificationCodeGenerator,
                                final EmailService emailService) {
        this.accountRepository = accountRepository;
        this.accountNotFoundByEmailHandler = accountNotFoundByEmailHandler;
        this.accountNotActiveHandler = accountNotActiveHandler;
        this.verificationCodeGenerator = verificationCodeGenerator;
        this.emailService = emailService;
    }

    public String reset(final String email) {
        final Account account = accountRepository.findByEmail(email);
        if (account == null) {
            return accountNotFoundByEmailHandler.handle(email);
        } else if (account.isNotActive()) {
            final String result = accountNotActiveHandler.handle(account);
            if (result != null) {
                return result;
            }
        }
        final String code = verificationCodeGenerator.generate();
        account.setCode(code);
        accountRepository.update(account);
        emailService.sendPasswordResetEmail(email, code);
        return "password_reset_success.html";
    }
}
