package academy.devonline.java.section071_class_types;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class MethodReferenceExample {
    @FunctionalInterface
    interface Interface1 {
        void method();
    }

    final Interface1 i1 = System.out::println;
    final Interface1 i2 = this::qwerty;

    void qwerty() {
        System.out.println("qwerty");
    }

    public static void main(String[] args) {
        final MethodReferenceExample o = new MethodReferenceExample();
        o.i2.method();
        final Interface2 i1 = o::test;
        System.out.println(i1.temp("12"));
    }

    @FunctionalInterface
    interface Interface2 {
        int temp(String value);
    }

    final Interface2 i3 = Integer::parseInt;

    int test(String value) {
        return value.charAt(0);
    }
}
