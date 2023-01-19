package academy.devonline.java.section051_static;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class StaticMethodAsCreator {
    public static class MyClass {
        private static final MyClass TEST_OBJECT = new MyClass();

        private MyClass() {
        }

        public static MyClass create() {
            if (System.getenv("JAVA_HOME") != null) {
                return TEST_OBJECT;
            } else {
                return new MyClass();
            }
        }

        public void doSomething() {
            System.out.println("doSomething");
        }
    }

    public static void main(final String[] args) {
//        MyClass o = new MyClass();
        MyClass o = MyClass.create();
        o.doSomething();
        System.out.println(o);
    }
}
