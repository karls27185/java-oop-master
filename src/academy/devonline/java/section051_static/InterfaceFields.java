package academy.devonline.java.section051_static;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class InterfaceFields {

    private static class MyClass{
        public static final int VALUE = 67;
    }

    private interface MyInterface{
        int VALUE = 56; //public static final
    }

    public static void main(String[] args) {
        System.out.println(MyClass.VALUE);
        System.out.println(MyInterface.VALUE);
    }
}
