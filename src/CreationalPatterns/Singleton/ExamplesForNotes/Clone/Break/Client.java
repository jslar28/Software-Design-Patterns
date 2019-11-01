package CreationalPatterns.Singleton.ExamplesForNotes.Clone.Break;

public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.someRandomMethod();

        System.out.println(s1);
        System.out.println(s2);
    }
}
