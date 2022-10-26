package academy.devonline.java.section041_oop;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class ProductTest {

    public static void main(String[] args) {
        Product[] products = null;

        for (Product product : products) {
            System.out.println(product.name);
            System.out.println(product.description);
            System.out.println(product.price);
        }
    }
}
