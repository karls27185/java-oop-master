package academy.devonline.java.section061_enum;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class Solution3 {

//    public static final class Status {
//        public static final Status STARTED = new Status();
//        public static final Status IN_PROGRESS = new Status();
//        public static final Status COMPLETED = new Status();
//
//        private Status() {
//        }
//    }

    public enum Status {
        STARTED,
        IN_PROGRESS,
        COMPLETED
    }

    public static class Task {
        private Status status = Status.STARTED;

        public void setStatus(final Status status) {
            this.status = status;
        }
    }

    public static void main(final String[] args) {
        Task task = new Task();
        //
        task.setStatus(Status.IN_PROGRESS);
        //
        task.setStatus(Status.COMPLETED);
    }
}
