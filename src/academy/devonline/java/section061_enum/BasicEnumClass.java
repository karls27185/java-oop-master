package academy.devonline.java.section061_enum;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class BasicEnumClass {

    public enum Status {
        STARTED,
        COMPLETED,
        IN_PROGRESS
    }

    public static void main(final String[] args) {
        final Status status = Status.STARTED;
        System.out.println(status.toString());
        System.out.println(status.name());
        System.out.println(status.ordinal());

        System.out.println(Status.IN_PROGRESS.ordinal());
        System.out.println(Status.COMPLETED.ordinal());

        final Status status1 = Status.valueOf("STARTED");
        System.out.println(status == status1);

        final Status status2 = Status.valueOf("COMPLETED");
        System.out.println(status == status2);

        final Status status3 = Enum.valueOf(Status.class, "STARTED");
        System.out.println(status == status3);

        for (final Status value : Status.values()) {
            System.out.print(value + ", ");
        }
    }
}
