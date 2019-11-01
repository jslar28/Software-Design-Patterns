package StructuralPatterns.Adapter;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.doSomethingSimple();
        target.doSomethingComplex();
    }
}
