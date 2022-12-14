package academy.devonline.java.structures;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public abstract class BasedOnArrayDataStorage extends BaseDataStorage {

    protected int[] array;

    public BasedOnArrayDataStorage(int size) {
        array = new int[size];
    }

    public BasedOnArrayDataStorage() {
        this(5);
    }

    @Override
    public final void add(int value) {
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
            return getIfNotEmpty();
        } else {
            throw createEmptyException();
        }
    }

    protected abstract RuntimeException createEmptyException();

    protected abstract int getIfNotEmpty();

}
