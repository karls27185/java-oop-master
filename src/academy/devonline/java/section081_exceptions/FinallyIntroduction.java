package academy.devonline.java.section081_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class FinallyIntroduction {
    public static void main(String[] args) {
        try{
            System.out.println("try: before doSomething()");
            doSomething();
            System.out.println("try: after doSomething()");
        } catch (final InputMismatchException exception){
            System.out.println("catch: InputMismatchException");
        } finally {
            System.out.println("After try-catch");
        }
    }

    /**
     * @throws InputMismatchException
     * @throws IllegalArgumentException
     */

    private static void doSomething() {
        final int value = new Scanner(System.in).nextInt();
        if (value < 0){
            throw new IllegalArgumentException("value < 0");
        }
        System.out.println("doSomething() method");
    }
}
