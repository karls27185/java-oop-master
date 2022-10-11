package academy.devonline.java.section031_polymorphism;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class GetClassUsage {

    public static void main(String[] args) {
//        Object o = new Child();
        Object o1 = new Child();
        Object o2 = null;
        // instanceof
        // 1) Supports parent classes
        System.out.println(o1 instanceof Parent);
        // 2) Supports null
        System.out.println(o2 instanceof Parent);

        System.out.println("-----------------------------------------");

        // getClass
        // 1) Does not support parent classes
        System.out.println(o1.getClass() == Parent.class);
        // 2) Does not support null
        System.out.println(o2.getClass() == Parent.class);
//        o.getClass();
//        System.out.println(o.getClass());

//        boolean result = o instanceof Child;
//        System.out.println(result);
//        System.out.println(o instanceof Child);
//        if(o instanceof Child){
//            System.out.println("Child");
//        }
//        System.out.println(o.getClass());
//        if (o.getClass() == Child.class){
//            System.out.println("Child");
//        }
    }

//    private static class GrandParent /*extends Object*/ {
//
//    }

//    private static class Parent extends GrandParent {
//
//    }
    private static class Parent /*extends Object*/ {

    }

    private static class Child extends Parent {

    }
}
