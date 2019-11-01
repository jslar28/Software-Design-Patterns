package StructuralPatterns.Flyweight;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        int numberOfWindows = 10000;
        ArrayList<String> colors = new ArrayList<>();
        colors.add("RED");
        colors.add("BLUE");
        colors.add("GREEN");
        colors.add("YELLOW");

        ArrayList<Window> windows = new ArrayList<>();
        Random r = new Random();

        //StructuralPatterns.Flyweight.WindowColorFactory.getWindowFlyweight
        WindowColorFactory factory = new WindowColorFactory();

        for (int i = 0; i < numberOfWindows; i++) {
            Window window = new Window(
                    (10 + (40 - 10) * r.nextDouble()),
                    (10 + (40 - 10) * r.nextDouble()),
                    factory.getWindowFlyweight(colors.get(r.nextInt(colors.size())))
            );
            windows.add(window);
            //System.out.println(window.toString());
        }

        System.out.println("Amount of windows: " + windows.size());
    }
}
