package CreationalPatterns.Singleton.Exercise;

/**
 * Created by Jakob S. Larsen on 05/09/2019.
 */

public class WannabeSingleton {
    private static boolean didCreate = false;

    public static WannabeSingleton createInstance() {
        if (!didCreate) {
            return new WannabeSingleton();
        } else {
            return null;
        }
    }

    private WannabeSingleton() {
        didCreate = true;
    }
}