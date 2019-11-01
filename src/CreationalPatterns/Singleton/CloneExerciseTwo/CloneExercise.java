package CreationalPatterns.Singleton.CloneExerciseTwo;


/**
 * Created by Jakob S. Larsen on 11/09/2019.
 */
public class CloneExercise {
    public static void main(String[] args) {
        Singleton s = new Singleton();

        try {
            Singleton sClone = (Singleton) s.clone();
            System.out.println("Created: " + sClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}