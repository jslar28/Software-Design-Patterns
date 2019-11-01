package CreationalPatterns.Singleton.CloneExercise;

/**
 * Created by Jakob S. Larsen on 11/09/2019.
 */
public class Singleton implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("I'm trying to clone!");
        return super.clone();
    }
}