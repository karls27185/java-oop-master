package academy.devonline.java.section061_enum;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class Solution1 {

    public static final class Status { //утилитный класс
        public static final int STARTED = 1;
        public static final int IN_PROGRESS = 2;
        public static final int COMPLETED = 3;

        private Status() {
        }
    }

    public static class Task {
        private int status = Status.STARTED;

        public void setStatus(final int status) {
            this.status = status;
        }
    }

    public static void main(final String[] args) {
        Task task = new Task();
        //запуск процесса
        task.setStatus(Status.IN_PROGRESS);
        //процесс завершен
        task.setStatus(Status.COMPLETED);
    }
}
