package academy.devonline.java.section081_exceptions;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class FinallyBadExamples {
    public static void main(final String[] args) {
        // 1)
         System.out.println(example1());

        // 2)
         System.out.println(example2());

        // 3)
         System.out.println(example3());

        // 4)
         System.out.println(example4());

        System.out.println(validExample());
    }

    private static int example1() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    private static int example2() {
        try {
            return 2 / 0;
        } finally {
            return 2;
        }
    }

    private static int example3() {
        try {
            return 1;
        } finally {
            String s = "null";
            s.length();
        }
    }

    private static int example4() {
        try {
            return 2 / 0;
        } finally {
            String s = "null";
            return s.length();
        }
    }

    private static int validExample() {
        try {
            // any code
            return 1;
        } finally {
            // code without returns and throw exceptions!
        }
    }
}
