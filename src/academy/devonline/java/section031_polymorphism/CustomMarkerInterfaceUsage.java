package academy.devonline.java.section031_polymorphism;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class CustomMarkerInterfaceUsage {
    private interface MarkerInterface {

    }

    private static class Parent {
        void doSomething(){
            if (this instanceof MarkerInterface){
                System.out.println("OK");
            }else {
                System.out.println("FAILED");
            }
        }
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.doSomething();
    }

    private static class Child extends Parent implements MarkerInterface{}
}
