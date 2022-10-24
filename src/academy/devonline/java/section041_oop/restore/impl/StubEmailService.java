package academy.devonline.java.section041_oop.restore.impl;

import academy.devonline.java.section041_oop.restore.EmailService;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public final class StubEmailService implements EmailService {

    @Override
    public void sendPasswordResetEmail(String email, String code) {
        System.out.println("Send cod=" + code + " to " + email + " email!");
    }
}
