package academy.devonline.java.section051_static;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class StaticMethods {
    private static int value;

    public static int getValue() {
        return value;
    }

    public static void main(String[] args) {
        value = 56;
        System.out.println(value);
        value = 78;
        System.out.println(value);
    }
}
