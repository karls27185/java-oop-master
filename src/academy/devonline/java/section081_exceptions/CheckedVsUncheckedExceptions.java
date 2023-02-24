package academy.devonline.java.section081_exceptions;

import java.util.Scanner;

public class CheckedVsUncheckedExceptions {
    public static void main(String[] args) {
        runTest();
    }

    private static void runTest() {
        runUncheckedExceptionExample();
        try {
            runCheckedExceptionExample();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void runCheckedExceptionExample() throws Exception {
        final int value = new Scanner(System.in).nextInt();
        if (value < 0 ) {
            throw new Exception("Number must be positive!");
        }
    }

    private static void runUncheckedExceptionExample() {
        final int value = new Scanner(System.in).nextInt();
        if (value < 0 ) {
            throw new IllegalArgumentException("Number must be positive!");
        }
    }
}
