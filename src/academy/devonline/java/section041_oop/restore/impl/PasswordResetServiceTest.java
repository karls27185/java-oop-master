package academy.devonline.java.section041_oop.restore.impl;

import academy.devonline.java.section041_oop.restore.PasswordResetService;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */

final class PasswordResetServiceTest {

    private PasswordResetService service;

    public PasswordResetServiceTest(PasswordResetService service) {
        this.service = service;
    }

    public void test(String email) {
        System.out.println(email + " -> " + service.reset(email));
    }

    public static void main(String[] args) {
        PasswordResetServiceTest passwordResetServiceTest = new PasswordResetServiceTest(new PasswordResetService(
                new FromRAMAccountRepository(),
                new DisplayAccountNotFoundByEmailHandler(),
                new DisableAccountNotActiveHandler(),
                new DefaultNumberVerificationCodeGenerator(6),
                new StubEmailService()
        ));
        passwordResetServiceTest.test("test0@babayan.keenetic.link");
        passwordResetServiceTest.test("test1@babayan.keenetic.link");
        passwordResetServiceTest.test("test2@babayan.keenetic.link");

        passwordResetServiceTest = new PasswordResetServiceTest(new PasswordResetService(
                new FromRAMAccountRepository(),
                new ShowSuccessAccountNotFoundByEmailHandler(),
                new DisableAccountNotActiveHandler(),
                new DefaultNumberVerificationCodeGenerator(6),
                new StubEmailService()
        ));
        passwordResetServiceTest.test("test0@babayan.keenetic.link");
        passwordResetServiceTest.test("test1@babayan.keenetic.link");
        passwordResetServiceTest.test("test2@babayan.keenetic.link");
    }
}
