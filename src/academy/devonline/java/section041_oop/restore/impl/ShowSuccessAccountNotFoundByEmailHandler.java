package academy.devonline.java.section041_oop.restore.impl;

import academy.devonline.java.section041_oop.restore.AccountNotFoundByEmailHandler;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class ShowSuccessAccountNotFoundByEmailHandler implements AccountNotFoundByEmailHandler {
    @Override
    public String handle(String email) {
        return "password_reset_success.html";
    }
}
