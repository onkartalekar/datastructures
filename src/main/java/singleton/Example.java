package singleton;

/**
 * @author taleko01
 */

public class Example {

    private static Example instance;

    private Example() {
    }

    public static Example getInstance() {
        if (instance != null) {
            return instance;
        }

        synchronized (Example.class) {
            if (instance == null) {
                instance = new Example();
            }
            return instance;
        }
    }

}
