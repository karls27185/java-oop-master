package academy.devonline.java.section041_oop.restore;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public interface EmailService {
    void sendPasswordResetEmail(String email, String code);
}
