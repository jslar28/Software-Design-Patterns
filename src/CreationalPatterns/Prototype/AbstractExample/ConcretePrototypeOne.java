package CreationalPatterns.Prototype.AbstractExample;

class ConcretePrototypeOne extends AbstractPrototype {
    ConcretePrototypeOne() {
        // Complex or costly creation code here
    }

    @Override
    void someMethod() {
        System.out.println("someMethod() in ConcretePrototypeOne");
    }
}
