package academy.devonline.java.section051_static;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class StaticFields {

    private static int value;
    private int value2;

    public static void main(String[] args) {
        StaticFields o1 = new StaticFields();
        StaticFields o2 = new StaticFields();

        o1.value =5;
        o2.value =8;
        o1.value2 =5;
        o2.value2 =8;

        System.out.println(o1.value);
        System.out.println(o2.value);
        System.out.println(o1.value2);
        System.out.println(o2.value2);
    }
}
