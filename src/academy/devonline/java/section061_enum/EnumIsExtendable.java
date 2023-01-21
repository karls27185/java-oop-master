package academy.devonline.java.section061_enum;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class EnumIsExtendable {
    public enum Status {
        STARTED(1),
        COMPLETED(2),
        IN_PROGRESS(3);
        private final int value;

        Status(final int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
        public boolean isCompleted(){
            return this==COMPLETED;
    }

        @Override
        public String toString() {
            return String.valueOf(ordinal());
        }
    }
    public static void main(final String[] args){
        final Status status=Status.COMPLETED;
        System.out.println(status.isCompleted());
        System.out.println(status.getValue());
        System.out.println(status);
    }
}
