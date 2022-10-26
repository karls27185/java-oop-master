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

    public PasswordResetService(AccountRepository accountRepository,
                                AccountNotFoundByEmailHandler accountNotFoundByEmailHandler,
                                AccountNotActiveHandler accountNotActiveHandler,
                                VerificationCodeGenerator verificationCodeGenerator,
                                EmailService emailService) {
        this.accountRepository = accountRepository;
        this.accountNotFoundByEmailHandler = accountNotFoundByEmailHandler;
        this.accountNotActiveHandler = accountNotActiveHandler;
        this.verificationCodeGenerator = verificationCodeGenerator;
        this.emailService = emailService;
    }

    public String reset(String email) {
        Account account = accountRepository.findByEmail(email);
        if (account == null) {
            return accountNotFoundByEmailHandler.handle(email);
        } else if (account.isNotActive()) {
            String result = accountNotActiveHandler.handle(account);
            if (result != null) {
                return result;
            }
        }
        String code = verificationCodeGenerator.generate();
        account.setCode(code);
        accountRepository.update(account);
        emailService.sendPasswordResetEmail(email, code);
        return "password_reset_success.html";
    }
}
