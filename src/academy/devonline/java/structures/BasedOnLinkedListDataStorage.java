package academy.devonline.java.structures;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */

public abstract class BasedOnLinkedListDataStorage extends BaseDataStorage {

    protected Item first;
    protected Item last;

    @Override
    public final void add(int value) {
        Item item = new Item(value);
        if (first == null) {
            first = last = item;
        } else {
            last.next = item;
            last = item;
        }
        size++;
    }

    protected static class Item {
        protected int value;
        protected Item next;

        private Item(int value) {
            this.value = value;
        }
    }
}
