package academy.devonline.java.section091_exception_usage;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class MyExceptionClassCharacteristics {
    public static void main(String[] args) {
        final Exception cause = createCause();
        final MyException[] exceptions = {
                MyException.createFull("error message", cause),
                MyException.createWithMessage("error message"),
                MyException.createWithCause(cause),
                MyException.createEmpty(),
                MyException.createFullWithoutStackTrace("error message", cause),
                MyException.createWithMessageAndWithoutStackTrace("error message"),
                MyException.createWithCauseAndWithoutStackTrace(cause),
                MyException.createEmptyWithoutStackTrace()};
        for (int i = 0, exceptionsLength = exceptions.length; i < exceptionsLength; i++) {
            final MyException exception = exceptions[i];
            try {
                method1(exception);
            } catch (final MyException ex) {
                System.err.println(i + ") ---------------------------------------");
                ex.printStackTrace();
            }
        }
    }

    private static void method1(final MyException exception) {
        method2(exception);
    }

    private static void method2(final MyException exception) {
        throw (MyException) exception.fillInStackTrace();
    }

    private static Exception createCause() {
        return new Exception("cause");
    }


    public static final class MyException extends RuntimeException {
        public MyException(final String message,
                           final Throwable cause,
                           final boolean enableSuppression,
                           final boolean writableStackTrace) {
            super(message != null ? message : (cause != null ? cause.toString() : null), cause, enableSuppression, writableStackTrace);
        }

        public static MyException createFull(final String message, final Throwable cause) {
            return new MyException(message, cause, true, true);
        }

        public static MyException createWithMessage(final String message) {
            return new MyException(message, null, true, true);
        }

        public static MyException createWithCause(final Throwable cause) {
            return new MyException(null, cause, true, true);
        }

        public static MyException createEmpty() {
            return new MyException(null, null, true, true);
        }

        public static MyException createFullWithoutStackTrace(final String message, final Throwable cause) {
            return new MyException(message, cause, true, false);
        }

        public static MyException createWithMessageAndWithoutStackTrace(final String message) {
            return new MyException(message, null, true, false);
        }

        public static MyException createWithCauseAndWithoutStackTrace(final Throwable cause) {
            return new MyException(null, cause, true, false);
        }

        public static MyException createEmptyWithoutStackTrace() {
            return new MyException(null, null, true, false);
        }
    }
}
