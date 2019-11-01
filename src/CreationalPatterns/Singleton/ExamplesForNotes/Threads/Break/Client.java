package CreationalPatterns.Singleton.ExamplesForNotes.Threads.Break;

public class Client {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            Singleton s1 = Singleton.getInstance();
            System.out.println(s1);
        });
        Thread t2 = new Thread(() -> {
                Singleton s2 = Singleton.getInstance();
                System.out.println(s2);
        });

        t1.start();
        t2.start();
    }
}
