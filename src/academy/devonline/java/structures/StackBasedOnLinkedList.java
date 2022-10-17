package academy.devonline.java.structures;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */

public final class StackBasedOnLinkedList extends BasedOnLinkedListDataStorage {
    @Override
    protected void addNextItem(Item item) {
        item.next = first;
        first = item;
    }
}
