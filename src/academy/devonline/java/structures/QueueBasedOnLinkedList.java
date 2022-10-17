package academy.devonline.java.structures;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */

public final class QueueBasedOnLinkedList extends BasedOnLinkedListDataStorage {
    @Override
    public int get() {
        if (size > 0) {
            int result = first.value;
            first = first.next;
            size--;
            if(size == 0){
                last = null;
            }
            return result;
        } else {
            throw new RuntimeException("Queue is empty");
        }
    }
}
