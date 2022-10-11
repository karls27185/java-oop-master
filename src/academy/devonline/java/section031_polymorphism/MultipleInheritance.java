package academy.devonline.java.section031_polymorphism;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class MultipleInheritance {
    private interface Interface1{
        void method1();
    }

    private interface Interface2{
        void method1();
        void method2();
    }

    private interface Interface3{
        void method3();
    }

    private static class Parent /*extends Object*/ {

    }

    public static class Child extends Parent implements Interface1, Interface2, Interface3 {

        @Override
        public void method1() {

        }

        @Override
        public void method2() {

        }

        @Override
        public void method3() {

        }
    }
}
