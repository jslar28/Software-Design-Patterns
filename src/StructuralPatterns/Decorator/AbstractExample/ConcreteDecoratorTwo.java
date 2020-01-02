package StructuralPatterns.Decorator.AbstractExample;

public class ConcreteDecoratorTwo extends BaseDecorator {
    public ConcreteDecoratorTwo(Component wrapTarget) {
        super(wrapTarget);
    }

    @Override
    public void execute() {
        super.execute();
        extraExecuteTwo();
    }

    public void extraExecuteTwo() {
        System.out.println("Executed extra on ConcreteDecoratorTwo");
    }
}
