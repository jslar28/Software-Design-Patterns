package BehavioralPatterns.Iterator;

public class Client {
    public static void main(String[] args) {
        Collection collection = new ConcreteCollection();
        Iterator iterator = collection.createConcreteIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.getNext().toString());
        }
    }
}
