package academy.devonline.java.section081_exceptions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class WhatIsStackTrace {
    public static void main(String[] args) {
        try {
            method1();
        }catch (Exception e){
            System.err.println(Arrays.toString(e.getStackTrace()));
        }
        method2();
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        final int value = new Scanner(System.in).nextInt();
        System.out.println(value);
    }
}
