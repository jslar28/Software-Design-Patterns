package CreationalPatterns.Prototype.AbstractExample;

class ConcretePrototypeTwo extends AbstractPrototype {
    int z;

    ConcretePrototypeTwo() {
        // Complex or costly creation code here
    }

    @Override
    void someMethod() {
        System.out.println("someMethod() in ConcretePrototypeTwo");
    }
}
