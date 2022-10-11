package academy.devonline.java.section031_polymorphism;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class MarkerInterfaceExample implements Cloneable {

    public static void main(String[] args) throws CloneNotSupportedException {
        MarkerInterfaceExample o1 = new MarkerInterfaceExample();
        Object o2 = o1.clone();

        System.out.println("o1 = " + o1);
        System.out.println("o2 = " + o2);
    }
}
