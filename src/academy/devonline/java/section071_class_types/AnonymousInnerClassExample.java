package academy.devonline.java.section071_class_types;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class AnonymousInnerClassExample {
    private final AbstractClass field = new AbstractClass() {
        private final boolean a;

        {
            a = true;
        }

        @Override
        public void method() {
            System.out.println("Hello world");
        }
    };

    void method(){
        final AbstractClass var = new AbstractClass(){

            @Override
            public void method() {
                System.out.println("Java");
            }
        };
        var.method();
    }

    public static void main(String[] args) {
        AnonymousInnerClassExample example = new AnonymousInnerClassExample();
        example.field.method();

        example.method();
    }
}
