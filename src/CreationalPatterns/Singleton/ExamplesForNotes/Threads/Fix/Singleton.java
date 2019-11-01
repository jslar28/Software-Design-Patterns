package CreationalPatterns.Singleton.ExamplesForNotes.Threads.Fix;

public class Singleton {
    private static Singleton instance;

    static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton() {}
}

