package StructuralPatterns.Adapter;

class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    void doSomethingSimple() {
        System.out.println("Something simple");
    }

    @Override
    void doSomethingComplex() {
        adaptee.someComplexMethod();
    }
}
