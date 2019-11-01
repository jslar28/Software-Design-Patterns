package StructuralPatterns.Bridge.Comparison.ExampleUsingBridgePattern;

abstract class WindowImplementation {
    abstract void displayContent();
}

class ChromeWindowImplementation extends WindowImplementation {
    @Override
    public void displayContent() {
        System.out.println("Display Chrome window content");
    }
}

class FirefoxWindowImplementation extends WindowImplementation {
    @Override
    public void displayContent() {
        System.out.println("Display Firefox window content");
    }
}
