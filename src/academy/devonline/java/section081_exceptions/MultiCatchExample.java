package academy.devonline.java.section081_exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MultiCatchExample {
    public static void main(String[] args) throws ClassNotFoundException {
        doSomething();
        System.out.println("After doSomething()");
    }

    /**
     *
     * @throws InputMismatchException
     * @throws NoSuchElementException
     * @throws IllegalStateException
     * @throws IllegalArgumentException
     * @throws ArithmeticException
     * @throws ClassNotFoundException
     */
    private static void doSomething() throws ClassNotFoundException {
        final int value = new Scanner(System.in).nextInt();
        if (value < 0){
            throw new IllegalArgumentException("value < 0");
        }
        if (value == 0){
            throw new ArithmeticException("value = 0!");
        }
        if (value == 5){
            throw new ClassNotFoundException("value = 5");
        }
        System.out.println("ok");
    }
}
