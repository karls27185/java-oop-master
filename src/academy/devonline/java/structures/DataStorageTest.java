package academy.devonline.java.structures;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
class DataStorageTest {

    public static void main(String[] args) {
//        DataStorage dataStorage = new QueueBasedOnArray(); // new Stack() or new Queue();
//        DataStorage dataStorage = new StackBasedOnArray();
//        DataStorage dataStorage = new QueueBasedOnLinkedList();
        DataStorage dataStorage = new StackBasedOnLinkedList();

        for (int i = 0; i < 5; i++) {
            dataStorage.add(i);
        }

        // 4 3 2 1 0 = for Stack
        // 0 1 2 3 4 = for Queue
        while (dataStorage.size() > 0) {
            System.out.print(dataStorage.get() + " ");
        }
        System.out.println();

    }
}
