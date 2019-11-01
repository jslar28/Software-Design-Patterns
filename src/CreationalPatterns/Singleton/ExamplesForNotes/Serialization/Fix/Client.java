package CreationalPatterns.Singleton.ExamplesForNotes.Serialization.Fix;

import java.io.*;

public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = null;

        try {
            ObjectOutput out = null;

            // Serialize s1
            out = new ObjectOutputStream(
                    new FileOutputStream("filename.ser")
            );
            out.writeObject(s1);
            out.close();

            // Deserialize s1 into s2
            ObjectInput in = new ObjectInputStream(
                    new FileInputStream("filename.ser")
            );
            s2 = (Singleton) in.readObject();
            in.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(s1);
        System.out.println(s2);
    }
}
