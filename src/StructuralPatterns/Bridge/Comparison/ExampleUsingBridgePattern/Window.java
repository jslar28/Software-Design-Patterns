package StructuralPatterns.Bridge.Comparison.ExampleUsingBridgePattern;

abstract class Window {
    WindowImplementation implementation;
    abstract void showContent();

    Window(WindowImplementation implementation) {
        this.implementation = implementation;
    }

    Window() {
        this.implementation = new ChromeWindowImplementation();
    }

    WindowImplementation getImplementation() {
        return implementation;
    }

    void setImplementation(WindowImplementation implementation) {
        this.implementation = implementation;
    }

}

class VideoWindow extends Window {
    VideoWindow(WindowImplementation windowImplementation) {
        super(windowImplementation);
    }

    VideoWindow() {
        super();
    }

    @Override
    void showContent() {
        implementation.displayContent();
    }
}

class StandardWindow extends Window {
    StandardWindow(WindowImplementation windowImplementation) {
        super(windowImplementation);
    }

    StandardWindow() {
        super();
    }

    @Override
    void showContent() {
        implementation.displayContent();
    }
}
