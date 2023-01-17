package academy.devonline.java.section051_static;

import java.util.Arrays;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;
/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class StaticImport {

    private static final int MAX_VAL = 78;

    public static void main(String[] args) {
        System.out.println(MAX_VAL);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.parseInt("45"));

        out.println(MAX_VALUE);
        out.println(parseInt("45"));

        out.println(java.util.Arrays.toString(new int[0]));
        out.println(Arrays.toString(new int[0]));
    }
}
