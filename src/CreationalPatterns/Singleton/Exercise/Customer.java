package CreationalPatterns.Singleton.Exercise;

import CreationalPatterns.Singleton.Singleton;

import java.lang.reflect.Field;

/**
 * Created by Jakob S. Larsen on 05/09/2019.
 */

public class Customer {

    public static void main(String[] args) throws Exception {
        // tryWannabeSingleton();
        // tryOtherWannabeSingleton();
        Singleton s = Singleton.getInstance();
        Field[] fields = s.getClass().getDeclaredFields();
        System.out.println(fields.length);
        for (Field field: fields) {
            System.out.println(field);
        }
    }

    private static void tryWannabeSingleton() {
        WannabeSingleton x = WannabeSingleton.createInstance();
        WannabeSingleton y = WannabeSingleton.createInstance();
        System.out.println(x);
        System.out.println(y);
    }

    private static void tryOtherWannabeSingleton() {
        OtherWannabeSingleton o1 = null;
        OtherWannabeSingleton o2 = null;

        try {
            o1 = new OtherWannabeSingleton();
            o2 = new OtherWannabeSingleton();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(o1);
            System.out.println(o2);
        }
    }
}