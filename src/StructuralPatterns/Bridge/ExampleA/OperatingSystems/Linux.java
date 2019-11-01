package StructuralPatterns.Bridge.ExampleA.OperatingSystems;

public class Linux implements OperatingSystem {
    public void showPenguin() {
        System.out.println("(- v -)");
    }

    @Override
    public void action() {
        System.out.println("Linux action");
    }

    @Override
    public void advancedAction() {
        System.out.println("Advanced Linux action");
    }
}
