package academy.devonline.java.section041_oop.restore.impl;

import academy.devonline.java.section041_oop.restore.AccountNotFoundByEmailHandler;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */

public final class DisplayAccountNotFoundByEmailHandler implements AccountNotFoundByEmailHandler {

    @Override
    public String handle(String email) {
        return "account_not_found.html?email=" + email;
    }
}
