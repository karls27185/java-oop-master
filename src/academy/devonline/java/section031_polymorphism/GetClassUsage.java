package academy.devonline.java.section031_polymorphism;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class GetClassUsage {

    public static void main(String[] args) {
        Object o = new Parent();

        o.getClass();
        System.out.println(o.getClass());

        boolean result = o instanceof Child;
        System.out.println(result);
        System.out.println(o instanceof Child);
        if(o instanceof Child){
            System.out.println("Child");
        }

    }

    private static class GrandParent /*extends Object*/ {

    }

    private static class Parent extends GrandParent {

    }

    private static class Child extends Parent {

    }
}
