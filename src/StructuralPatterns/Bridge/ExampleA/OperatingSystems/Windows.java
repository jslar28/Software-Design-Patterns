package StructuralPatterns.Bridge.ExampleA.OperatingSystems;

public class Windows implements OperatingSystem {
    public void playWindowsErrorSound() {
        System.out.println("DUN");
    }

    @Override
    public void action() {
        System.out.println("Windows action");
    }

    @Override
    public void advancedAction() {
        System.out.println("Advanced Windows action");
    }
}
