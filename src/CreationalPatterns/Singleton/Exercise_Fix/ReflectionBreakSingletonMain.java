package CreationalPatterns.Singleton.Exercise_Fix;

/**
 * Created by Jakob S. Larsen on 05/09/2019.
 */

public class ReflectionBreakSingletonMain {

    public static void main(String[] args) {
        EagerSingleton s1 = EagerSingleton.getInstance();
        EagerSingleton s2 = ReflectionBreakSingleton.makeCopy(s1);
        System.out.println((s1 == s2) ? "CreationalPatterns/Singleton\n" : "Not a singleton\n");
    }
}
