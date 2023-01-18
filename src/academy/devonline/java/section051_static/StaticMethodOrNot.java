package academy.devonline.java.section051_static;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class StaticMethodOrNot {
    public static void main(String[] args) {
        String string = "Hello";

        System.out.println(string.length());
        System.out.println(string.substring(3));

        System.out.println(String.valueOf(34));
        System.out.println(String.join("/", new String[]{"one", "two", "three"}));

    }
}
