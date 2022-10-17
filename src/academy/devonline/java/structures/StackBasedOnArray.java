package academy.devonline.java.structures;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public final class StackBasedOnArray extends BasedOnArrayDataStorage {
    public StackBasedOnArray(int size) {
        super(size);
    }

    public StackBasedOnArray() {
    }

/*
    @Override

    public int get() {
        if (size > 0) {
            return array[--size];
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }
*/

    @Override
    protected int getIfNotEmpty() {
        return array[--size];
    }

    @Override
    protected RuntimeException createEmptyException() {
        return new RuntimeException("Stack is empty");
    }
}
