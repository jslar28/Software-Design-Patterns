package BehavioralPatterns.Iterator;

class ConcreteIterator implements Iterator {
    private ConcreteCollection collection = new ConcreteCollection();
    private ObjectType[] cache = null;
    private int position = 0;

    private void lazyInit() {
        if (cache == null) {
            cache = collection.collectionOfObjects;
        }
    }

    @Override
    public ObjectType getNext() {
        if (hasNext()) {
            position++;
            return cache[position - 1];
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        lazyInit();
        return cache.length > position;
    }
}
