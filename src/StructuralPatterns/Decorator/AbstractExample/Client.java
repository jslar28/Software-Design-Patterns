package StructuralPatterns.Decorator.AbstractExample;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component decoratorOne = new ConcreteDecoratorOne(component);
        Component decoratorTwo = new ConcreteDecoratorTwo(decoratorOne);

        decoratorTwo.execute();
    }
}
