package academy.devonline.java.section091_exception_usage;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class ConfigureExceptionCharacteristics {

    public static final class Ex0 extends RuntimeException {
        public Ex0() {
        }
    }

    public static final class Ex1 extends RuntimeException {
        public Ex1(final String message) {
            super(message);
        }
    }

    public static final class Ex2 extends RuntimeException {
        public Ex2(final String message, final Throwable cause) {
            super(message, cause);
        }

        public Ex2(final Throwable cause) {
            super(cause);
        }
    }

    public static final class Ex3 extends RuntimeException {
        public Ex3(final String message) {
            super(message, null, true, false);
        }
    }

}
