package BehavioralPatterns.Iterator;

class ObjectType {
    private String name;

    ObjectType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Object: " + name;
    }
}
