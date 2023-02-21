package academy.devonline.java.section081_exceptions;

import java.util.Scanner;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class SqrtExample {
    public static void main(final String[] args) {
        final double number = new Scanner(System.in).nextDouble();
        if (number >= 0) {
            System.out.println(Math.sqrt(number));
//            System.exit(0);
        } else {
            throw new IllegalArgumentException("Number must be positive!");
//            System.err.println("Number must be positive!");
//            System.exit(1);
        }
    }
}
