package academy.devonline.java.section091_exception_usage;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class UseExceptionToResolveAmbiguousCase {
    public static void main(String[] args) {
        final Mode mode = Mode.valueOf(args[0]);
        if (mode == Mode.A){
            System.out.println("A");
        } else if (mode == Mode.B){
            System.out.println("B");
        } else if (mode == Mode.C){
            System.out.println("C");
        } else if (mode == Mode.D){
            System.out.println("D");
        } else {
            throw new UnsupportedOperationException("Unsupported mode: " + mode);
        }
    }

    public enum Mode {
        A,
        B,
        C,
        D
    }
}
