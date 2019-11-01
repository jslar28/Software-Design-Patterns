package CreationalPatterns.Prototype.AbstractExample;

class Client {
    AbstractPrototype abstractPrototype;

    Client(AbstractPrototype abstractPrototype) {
        this.abstractPrototype = abstractPrototype;
    }

    void someClientCode() {
        System.out.println("CreationalPatterns.Prototype X: " + abstractPrototype.x +
                ", Y: " + abstractPrototype.y);
    }
}