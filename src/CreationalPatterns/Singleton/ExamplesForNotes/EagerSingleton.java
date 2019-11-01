package CreationalPatterns.Singleton.ExamplesForNotes;

class EagerSingleton {
    final static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {}
}
