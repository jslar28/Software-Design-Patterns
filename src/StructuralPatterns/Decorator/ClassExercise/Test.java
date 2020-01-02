package StructuralPatterns.Decorator.ClassExercise;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {

        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*
        JTextArea textArea = new JTextArea(20, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
         */

        char[] mask = {'a'};
        int value;

        InputStream in = new MaskInputStream(System.in, mask);

        while ((value = in.read()) != -1) {
            System.out.println((char) value);
        }

        /*
        System.out.println("File: ");
        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream("file.txt")));
        String input = bf.readLine();
        System.out.println(input);    }
         */
    }
}
