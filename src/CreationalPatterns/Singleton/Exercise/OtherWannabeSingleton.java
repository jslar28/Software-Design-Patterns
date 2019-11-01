package CreationalPatterns.Singleton.Exercise;

/**
 * Created by Jakob S. Larsen on 05/09/2019.
 */

public class OtherWannabeSingleton {
    private static boolean didCreate = false;

    public OtherWannabeSingleton() throws Exception {
        if (didCreate) {
            throw new Exception();
        } else {
            didCreate = true;
        }
    }
}