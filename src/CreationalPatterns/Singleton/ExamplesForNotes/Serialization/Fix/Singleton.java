package CreationalPatterns.Singleton.ExamplesForNotes.Serialization.Fix;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static Singleton instance;

    static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Object readResolve() {
        return instance;
    }

    private Singleton() {}
}
