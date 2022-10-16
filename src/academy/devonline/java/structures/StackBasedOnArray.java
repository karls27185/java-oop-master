package academy.devonline.java.structures;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */

public class StackBasedOnArray implements DataStorage {

    private int[] array;

    private int size;

    public StackBasedOnArray(int size) {
        array = new int[size];
    }

    public StackBasedOnArray() {
        this(5);
    }

    @Override
    public void add(int value) {
        if (size == array.length) {
            grow(array.length == 0 ? 5 : array.length * 2);
        }
        array[size++] = value;
    }

    private void grow(int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    @Override
    public int get() {
        if (size > 0) {
            return array[--size];
        } else {
            // TODO throw Exception
            return 0;
        }
    }

    @Override
    public int size() {
        return size;
    }
}
