package CreationalPatterns.Singleton.Exercise_Fix;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Jakob S. Larsen on 05/09/2019.
 */

public class ReflectionBreakSingleton {

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static EagerSingleton makeCopy(EagerSingleton s) {
        EagerSingleton s_copy = null;
        try {
            //Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
            Constructor[] constructors = s.getClass().getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                s_copy = (EagerSingleton) constructor.newInstance();
                break;
            }
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | SecurityException | InvocationTargetException ex) {
            ex.printStackTrace();
        }
        return s_copy;
    }
}
