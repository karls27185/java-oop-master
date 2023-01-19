package academy.devonline.java.section051_static;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class SimpleSingletonTemplate {

    private static final class Singleton{
        private static final Singleton INSTANCE = new Singleton();
        private Singleton(){}
        public static Singleton getInstance(){
            return INSTANCE;
        }
        public void doSomething1(){

        }
        public void doSomething2(){
            System.out.println("doSomething2");
        }
    }

    public static void main(String[] args) {
        final Singleton singleton = Singleton.getInstance();
        singleton.doSomething1();
        singleton.doSomething2();
    }

}
