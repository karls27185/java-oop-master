package academy.devonline.java.section081_exceptions;

import java.util.ServiceLoader;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class ErrorVsException {
    public static void main(String[] args) {
        final Test test = ServiceLoader.load(Test.class).findFirst().orElseThrow();
        try {
            test.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public interface Test{
        void doSomething() throws Exception;
    }
    public static final class TestImpl implements Test{
        @Override
        public void doSomething() throws Exception {
            final int[] ints = new int[Integer.MAX_VALUE];
            throw new OutOfMemoryError("");
        }
    }
}
