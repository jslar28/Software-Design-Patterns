package StructuralPatterns.Decorator.AbstractExample;

public class BaseDecorator implements Component {
    Component wrapTarget;

    public BaseDecorator(Component wrapTarget) {
        this.wrapTarget = wrapTarget;
    }

    @Override
    public void execute() {
        wrapTarget.execute();
    }
}
