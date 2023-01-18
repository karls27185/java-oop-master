package academy.devonline.java.section051_static;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class StaticVsNotStatic {
    private static class Static {
        private static int value = 56;
        private static final int CONST1 = 78;
        private static final int CONST2;

        static {
            value = 23;
            CONST2 = 89;
        }

        public static int getValue() {
            return value;
        }

        public static void setValue(final int value) {
            Static.value = value;
        }
    }

    private static class NotStatic {
        private int value = 56;
        private final int const1 = 78;
        private final int const2;

        {
            value = 23;
        }

        public NotStatic() {
            this.value = 23;
            this.const2 = 89;
        }

        public int getValue() {
            return value;
        }

        public void setValue(final int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        System.out.println(Static.getValue());
        Static.setValue(45);
        System.out.println(Static.getValue());

        NotStatic o = new NotStatic();
        System.out.println(o.getValue());
        o.setValue(45);
        System.out.println(o.getValue());
    }
}
