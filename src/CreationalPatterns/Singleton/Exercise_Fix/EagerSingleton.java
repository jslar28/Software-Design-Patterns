package CreationalPatterns.Singleton.Exercise_Fix;

/**
 * Created by Jakob S. Larsen on 05/09/2019.
 */

public class EagerSingleton {

    private static EagerSingleton S_INSTANCE;

    static {
        try {
            S_INSTANCE = new EagerSingleton();
        } catch (InstantiationException e) {
            System.out.println("fuck sake");
        }
    }

    public static EagerSingleton getInstance() {
        return(EagerSingleton.S_INSTANCE);
    }

    private EagerSingleton() throws InstantiationException {
        if (EagerSingleton.S_INSTANCE != null) {
            System.out.println("wat");
            throw new InstantiationException();
        }
    }
}