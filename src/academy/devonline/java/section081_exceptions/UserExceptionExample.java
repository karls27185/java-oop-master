package academy.devonline.java.section081_exceptions;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class UserExceptionExample {
    public static void main(final String[] args) {
        if (args.length == 0) {
            throw new MissingRequiredCommandLineArgumentException("Argument 'gui' or 'console' is required!");
        }
    }

    public static final class MissingRequiredCommandLineArgumentException extends RuntimeException {
        public MissingRequiredCommandLineArgumentException(final String message) {
            super(message);
        }
    }
}
