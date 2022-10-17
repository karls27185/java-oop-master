package academy.devonline.java.structures;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */

public final class QueueBasedOnLinkedList extends BasedOnLinkedListDataStorage {
    @Override
    protected void addNextItem(Item item) {
        last.next = item;
        last = item;
    }
}
