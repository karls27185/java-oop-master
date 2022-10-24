package academy.devonline.java.section041_oop.restore.impl;

import academy.devonline.java.section041_oop.restore.Account;
import academy.devonline.java.section041_oop.restore.AccountRepository;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public final class FromRAMAccountRepository implements AccountRepository {

    private DefaultAccount[] accounts = {
            new DefaultAccount("test1@babayan.keenetic.link", true),
            new DefaultAccount("test2@babayan.keenetic.link", false)
    };

    @Override
    public Account findByEmail(String email) {
        for (DefaultAccount account : accounts) {
            if (email.equals(account.getEmail())) {
                return account;
            }
        }
        return null;
    }

    @Override
    public void update(Account account) {
        //do nothing
    }
}
