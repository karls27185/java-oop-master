package academy.devonline.java.section081_exceptions;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class ExceptionCharacteristics {

    public static void main(final String[] args) {
        try {
            method1();
        } catch (final RuntimeException exception) {
            exception.printStackTrace();

            System.err.println("________________________");

            System.err.println(exception.getClass().getName());

            System.err.println("________________________");

            System.err.println(exception.getMessage());

            System.err.println("________________________");

            for (final StackTraceElement stackTraceElement : exception.getStackTrace()) {
                System.err.println(
                        stackTraceElement.getClassName() + "." +
                                stackTraceElement.getMethodName() + "(" +
                                stackTraceElement.getFileName() + ":"
                                + stackTraceElement.getLineNumber() + ")");
            }
        }
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        final int[] array = new int[10];
        System.out.println(array[array.length]);
    }
}
