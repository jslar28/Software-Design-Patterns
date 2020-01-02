package StructuralPatterns.Decorator.AbstractExample;

public class ConcreteDecoratorOne extends BaseDecorator {
    public ConcreteDecoratorOne(Component wrapTarget) {
        super(wrapTarget);
    }

    @Override
    public void execute() {
        super.execute();
        extraExecuteOne();
    }

    public void extraExecuteOne() {
        System.out.println("Executed extra on ConcreteDecoratorOne");
    }
}
