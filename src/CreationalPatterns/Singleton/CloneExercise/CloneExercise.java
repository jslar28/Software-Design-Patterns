package CreationalPatterns.Singleton.CloneExercise;

/**
 * Created by Jakob S. Larsen on 11/09/2019.
 */
public class CloneExercise {
    public static void main(String[] args) {
        Singleton singleton = new Singleton();

        try {
            Singleton singletonClone = (Singleton) singleton.clone();
            System.out.println("Created: " + singletonClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}