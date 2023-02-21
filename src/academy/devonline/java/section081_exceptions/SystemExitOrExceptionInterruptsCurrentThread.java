package academy.devonline.java.section081_exceptions;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class SystemExitOrExceptionInterruptsCurrentThread {
    public static void main(String[] args) {
        System.out.println("1");
//        System.exit(0);
        System.out.println("2");
//        System.out.println(2/0);
        System.out.println("3");
    }
}
