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
            addNextItem(item);
        }
        size++;
    }

    protected abstract void addNextItem(Item item);

    @Override
    public final int get() {
        if (size > 0) {
            int result = first.value;
            first = first.next;
            size--;
            if (size == 0) {
                last = null;
            }
            return result;
        } else {
            throw new RuntimeException("Queue is empty");
        }
    }

    protected static class Item {
        protected int value;
        protected Item next;

        private Item(int value) {
            this.value = value;
        }
    }
}
