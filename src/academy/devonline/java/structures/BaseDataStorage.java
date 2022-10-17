package academy.devonline.java.structures;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public abstract class BaseDataStorage implements DataStorage {

    protected int size;

    @Override
    public final int size() {
        return size;
    }
}
