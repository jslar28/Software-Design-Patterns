package BehavioralPatterns.Iterator;

class ConcreteCollection implements Collection {
    // Replace with collection's code
    ObjectType[] collectionOfObjects = {
            new ObjectType("X"), new ObjectType("Y")
    };

    @Override
    public Iterator createConcreteIterator() {
        return new ConcreteIterator();
    }
}
