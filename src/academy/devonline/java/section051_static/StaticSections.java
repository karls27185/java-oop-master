package academy.devonline.java.section051_static;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */

public class StaticSections {

    private static class MyClass {
        private static int value;

        static {
            if (Runtime.getRuntime().availableProcessors() == 4) {
                value = 4;
            } else {
                value = 6;
            }
        }

        public static int getValue() {
            return value;
        }
    }

    private static class Launcher {

        public static void main(final String[] args) {
            System.out.println(MyClass.getValue());
            System.out.println(Runtime.getRuntime().availableProcessors());
        }
    }
}