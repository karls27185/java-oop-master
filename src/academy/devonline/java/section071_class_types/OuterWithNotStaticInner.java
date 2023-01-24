package academy.devonline.java.section071_class_types;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class OuterWithNotStaticInner {
    private static int value1 = 1;
    private int value2 = 2;

    private static void staticMethod(){}
    private void method(){
        Inner o = new Inner(); //Inner o = this.new Inner()
    }
    class Inner{
        void m(){
            value1=7;
            value2=5;
            staticMethod();
            method();
        }
    }

    public static void main(String[] args) {
        OuterWithNotStaticInner outer = new OuterWithNotStaticInner();
        Inner o = outer.new Inner();
        o.m();
    }
}
