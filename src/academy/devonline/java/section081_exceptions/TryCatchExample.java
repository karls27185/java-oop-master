package academy.devonline.java.section081_exceptions;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            System.out.println(2/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }
}
