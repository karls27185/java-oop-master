package academy.devonline.java.section041_oop;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */

public class ImmutableObject {

    private final String value;

    public ImmutableObject(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
