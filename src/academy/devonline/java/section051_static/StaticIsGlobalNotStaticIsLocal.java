package academy.devonline.java.section051_static;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class StaticIsGlobalNotStaticIsLocal {
    private static int staticField;
    private int field;

    static {
        staticField = 67;
        staticMethod1();
        staticMethod2();
    }

    public static void staticMethod2() {
        staticField = 78;
        staticMethod1();
    }

    public static void staticMethod1() {
        staticField = 67;
        staticMethod2();
    }

    public StaticIsGlobalNotStaticIsLocal() {
        field = 78;
        staticField = 89;

        method1();
        method2();

        staticMethod1();
        staticMethod2();
    }

    public void method1() {
        field=78;
        staticField=89;

        method2();

        staticMethod1();
        staticMethod2();
    }

    public void method2() {

    }

    public static void main(String[] args) {
        StaticIsGlobalNotStaticIsLocal o = new StaticIsGlobalNotStaticIsLocal();

        new StaticIsGlobalNotStaticIsLocal();

        o.method1();
        System.out.println(o.field);
    }
}
