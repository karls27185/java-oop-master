package academy.devonline.java.section081_exceptions;

import java.util.*;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (InputMismatchException e) {
            System.err.println("InputMismatchException: " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.err.println("NoSuchElementException: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.err.println("IllegalStateException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("InputMismatchException: " + e.getMessage());
        }

        System.out.println("After doSomething()");
    }

    /**
     * @throws InputMismatchException
     * @throws NoSuchElementException
     * @throws IllegalStateException
     * @throws IllegalArgumentException
     * @throws ArithmeticException
     * @throws ClassNotFoundException
     */

    private static void doSomething() throws ClassNotFoundException {
        final int value = new Scanner(System.in).nextInt();
        if (value < 0) {
            throw new IllegalArgumentException("value < 0");
        }
        if (value == 0) {
            throw new ArithmeticException("value = 0!");
        }
        if (value == 5) {
            throw new ClassNotFoundException("value = 5");
        }
        System.out.println("OK");
    }
}
