package academy.devonline.java.section071_class_types;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public enum Enum {
    VALUE_1,
    VALUE_2,
    VALUE_3;
    private int value2 = 2;

    class Inner {
        void m() {
            value2 = 89;
        }
    }
}
