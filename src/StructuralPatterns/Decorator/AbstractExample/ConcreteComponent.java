package StructuralPatterns.Decorator.AbstractExample;

public class ConcreteComponent implements Component {
    @Override
    public void execute() {
        System.out.println("Executed component");
    }
}
