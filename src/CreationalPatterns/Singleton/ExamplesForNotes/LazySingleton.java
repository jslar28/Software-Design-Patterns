package CreationalPatterns.Singleton.ExamplesForNotes;

class LazySingleton {
    private static LazySingleton instance;

    static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    private LazySingleton() {}
}
