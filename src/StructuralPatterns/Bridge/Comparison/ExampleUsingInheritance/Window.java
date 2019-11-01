package StructuralPatterns.Bridge.Comparison.ExampleUsingInheritance;

abstract class Window {
    abstract void use();
}

class ChromeWindow extends Window {
    @Override
    void use() {
        System.out.println("Use Chrome window.");
    }
}

class FirefoxWindow extends Window {
    @Override
    void use() {
        System.out.println("Use Firefox window.");
    }
}

abstract class VideoWindow extends Window {
    @Override
    void use() {
        System.out.println("Use video window.");
    }
}

class ChromeVideoWindow extends VideoWindow {
    @Override
    void use() {
        System.out.println("Use Chrome video window.");
    }
}

class FirefoxVideoWindow extends VideoWindow {
    @Override
    void use() {
        System.out.println("Use Firefox video window.");
    }
}
