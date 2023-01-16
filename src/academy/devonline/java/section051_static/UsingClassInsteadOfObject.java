package academy.devonline.java.section051_static;

import java.util.Arrays;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class UsingClassInsteadOfObject {

    private static int value;

    public static int getValue(){
        return value;
    }

    public static void main(String[] args) {
        value = 5;
        UsingClassInsteadOfObject.value = 8;

        System.out.println(value);
        System.out.println(UsingClassInsteadOfObject.value);
        System.out.println(getValue());
        System.out.println(UsingClassInsteadOfObject.getValue());

        System.out.println(Arrays.toString(new int[]{1, 2, 3}));
    }
}
