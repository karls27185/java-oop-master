package academy.devonline.java.section051_static;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class UtilsClassTemplate {
    private UtilsClassTemplate(){} //запрещает создание объекта класса.

    public static final int CONST_1 = 45;
    public static final int CONST_2;
    static {
        CONST_2=46;
    }
    public static int doSomething1(int a, boolean b){
        return 0;
    }
    public static int doSomething2(){
        return 0;
    }
}
