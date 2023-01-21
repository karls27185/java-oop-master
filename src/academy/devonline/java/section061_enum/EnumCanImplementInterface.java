package academy.devonline.java.section061_enum;

import java.io.Serializable;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class EnumCanImplementInterface {
    public interface MyInterface {
        int getValue();
    }

    public enum Status implements MyInterface, Serializable, Cloneable, AutoCloseable {
        STARTED,
        COMPLETED,
        IN_PROGRESS;

        @Override
        public int getValue() {
            return ordinal();
        }

        @Override
        public void close() throws Exception {

        }
    }

    public static void main(final String[] args) {
        final MyInterface myInterface=Status.COMPLETED;
        System.out.println(myInterface.getValue());
    }
}
