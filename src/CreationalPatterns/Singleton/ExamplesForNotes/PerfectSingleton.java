package CreationalPatterns.Singleton.ExamplesForNotes;

import java.io.Serializable;

public class PerfectSingleton implements Serializable, Cloneable {
    private volatile static PerfectSingleton instance;

    static PerfectSingleton getInstance() {
        if (instance == null) {
            synchronized (PerfectSingleton.class) {
                if (instance == null) {
                    instance = new PerfectSingleton();
                }
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Don't clone the singleton.");
    }

    protected Object readResolve() {
        return getInstance();
    }

    private PerfectSingleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method instead.");
        }
    }
}
