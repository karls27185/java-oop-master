package academy.devonline.java.section071_class_types;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class OuterWithStaticInner {
    private static int value1 = 1;
    private int value2 = 2;

    private static void staticMethod() {
    }

    private void method() {
    }

    static class Inner {
        void m() {
            value1 = 90;
            staticMethod();
//            value2 = 80;
//            method();
        }
    }

    public static void main(String[] args) {
        Inner o = new Inner();
    }
}
