package academy.devonline.java.section051_static;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class StaticMethodsNotPolymorph {
    static class Parent {
        static void doSomething() {
            System.out.println("Parent");
        }
    }

    static class Child extends Parent {
        static void doSomething() {
            System.out.println("Child");
        }
    }

    public static void main(String[] args) {
        final Parent[] parents = {new Parent(), new Child()};
        for (final Parent parent : parents) {
            parent.doSomething();
        }
    }
}
