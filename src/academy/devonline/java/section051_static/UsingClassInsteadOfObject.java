package academy.devonline.java.section051_static;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class UsingClassInsteadOfObject {

    private static int value;

    public static void main(String[] args) {
        value = 5;
        UsingClassInsteadOfObject.value = 8;

        System.out.println(value);
        System.out.println(UsingClassInsteadOfObject.value);
    }
}
