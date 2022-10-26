package academy.devonline.java.section041_oop;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */

public class JavaBean {

    private String field1;

    private String exampleField2;

    private boolean logicValueField3;

    public String getField4() {
        return "Hello";
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getExampleField2() {
        return exampleField2;
    }

    public void setExampleField2(String exampleField2) {
        this.exampleField2 = exampleField2;
    }

    public boolean isLogicValueField3() {
        return logicValueField3;
    }

    public void setLogicValueField3(boolean logicValueField3) {
        this.logicValueField3 = logicValueField3;
    }
}
