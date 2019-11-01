package CreationalPatterns.Singleton.Exercise;

/**
 * Created by Jakob S. Larsen on 05/09/2019.
 */
public class StaticBlockExample {

    static {
        System.out.println("lol");
        //System.loadLibrary('./lol');
    }

    public static void main(String[] args) {
        System.out.println("x");
    }
}
