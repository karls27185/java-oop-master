package academy.devonline.java.section081_exceptions;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class TryCatchFinallyExamples {
    public static void main(final String[] args) {
        // Case 1
        try {
            // code
        } catch (ArithmeticException e) {
            // code
        } catch (RuntimeException e) {
            // code
        } catch (Exception e) {
            // code
        } finally {
            // code
        }

        // Case 2
        try {
            // code
        } catch (ArithmeticException e) {
            // code
        } catch (IllegalArgumentException e) {
            // code
        } catch (IllegalStateException e) {
            // code
        } finally {
            // code
        }

        // Case 3
        try {
            // code
        } catch (ArithmeticException | IllegalArgumentException | IllegalStateException e) {
            // code
        } finally {
            // code
        }

        // Case 4
        try {
            // code
        } catch (ArithmeticException e) {
            // code
        }

        // Case 5
        try {
            // code
        } catch (RuntimeException e) {
            // code
        } finally {
            // code
        }

        // Case 6
        try {
            // code
        } finally {
            // code
        }
    }
}
