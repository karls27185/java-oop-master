package academy.devonline.java.section041_oop;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class ProductTest {

    public static void main(String[] args) {
        Product[] products = null;

        for (Product product : products) {

            //product.price = new BigDecimal("-23.23");
            //product.setPrice(new BigDecimal("-23.23"));

            System.out.println(product.getName());
            System.out.println(product.getDescription());
            System.out.println(product.getPrice());

        }
    }
}
