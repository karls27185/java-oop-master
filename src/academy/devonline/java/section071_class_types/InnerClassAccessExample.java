package academy.devonline.java.section071_class_types;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class InnerClassAccessExample {
    public static void main(final String[] args) {
        final OuterWithStaticInner.Inner inner=new OuterWithStaticInner.Inner();

        final OuterWithNotStaticInner outer=new OuterWithNotStaticInner();
        final OuterWithNotStaticInner.Inner o = outer.new Inner();
    }
}
