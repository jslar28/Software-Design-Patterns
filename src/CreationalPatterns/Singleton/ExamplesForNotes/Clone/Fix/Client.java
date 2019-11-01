package CreationalPatterns.Singleton.ExamplesForNotes.Clone.Fix;

import java.lang.reflect.Constructor;

public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = null;

        try {
            Constructor[] constructors = Singleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                s2 = (Singleton) constructor.newInstance();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(s1);
        System.out.println(s2);
    }
}
