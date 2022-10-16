package academy.devonline.java.structures;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
class DataStorageTest {

    public static void main(String[] args) {
        DataStorage dataStorage = new QueueBasedOnArray(); // new Stack() or new Queue();
        DataStorage dataStorage2 = new StackBasedOnArray(); // new Stack() or new Queue();

        for (int i = 0; i < 5; i++) {
            dataStorage.add(i);
        }

        for (int i = 0; i < 5; i++) {
            dataStorage2.add(i);
        }

        // 4 3 2 1 0 = for Stack
        // 0 1 2 3 4 = for Queue
        while (dataStorage.size() > 0) {
            System.out.print(dataStorage.get() + " ");
        }
        System.out.println();

        while (dataStorage2.size() > 0) {
            System.out.print(dataStorage2.get() + " ");
        }
        System.out.println();
    }
}