package CreationalPatterns.Singleton;

/**
 * Created by Jakob S. Larsen on 05/09/2019.
 */

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}