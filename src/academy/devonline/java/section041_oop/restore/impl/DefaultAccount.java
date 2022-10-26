package academy.devonline.java.section041_oop.restore.impl;

import academy.devonline.java.section041_oop.restore.Account;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public final class DefaultAccount implements Account {

    private final String email;

    private final boolean active;

    private String code;

    public DefaultAccount(String email, boolean active) {
        this.email = email;
        this.active = active;
    }

    @Override
    public boolean isNotActive() {
        return !active;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }
}
