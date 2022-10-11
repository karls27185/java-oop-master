package academy.devonline.java.section031_polymorphism;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class WhyInstanceOfIsBadPractice {
    public static void main(String[] args) {
        Parent parent = new Childe1();
        parent.doSomething();

         /*if (parent instanceof Child1) {
            // parent.getClass == Child1.class
            System.out.println("case 1");
        } else if (parent instanceof Child2) {
            // parent.getClass == Child2.class
            System.out.println("case 2");
        }*/
    }

    private interface Parent{
        void doSomething();
    }
    private static class Childe1 implements Parent{
        @Override
        public void doSomething() {
            System.out.println("case 1");
        }
    }
    private static class Childe2 implements Parent{
        @Override
        public void doSomething() {
            System.out.println("case 2");
        }
    }
}
