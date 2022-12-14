package academy.devonline.java.structures;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public final class QueueBasedOnArray extends BasedOnArrayDataStorage {
    public QueueBasedOnArray(int size) {
        super(size);
    }

    public QueueBasedOnArray() {
    }

/* @Override
    public int get() {
        if (size > 0) {
            int result = array[0];
            System.arraycopy(array, 1, array, 0, array.length - 1);
            size--;
            return result;
        } else {
            throw new RuntimeException("Queue is empty");
        }
    }
*/

    @Override
    protected int getIfNotEmpty() {
        int result = array[0];
        System.arraycopy(array, 1, array, 0, array.length - 1);
        size--;
        return result;
    }

    @Override
    protected RuntimeException createEmptyException() {
        return new RuntimeException("Queue is empty");
    }
}
