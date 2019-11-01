package CreationalPatterns.Singleton.ExamplesForNotes;

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        PerfectSingleton perfectSingleton = PerfectSingleton.getInstance();
    }
}
