package StructuralPatterns.Bridge.Comparison.ExampleUsingBridgePattern;

public class Client {
    public static void main(String[] args) {
        Window window = new StandardWindow();
        Window videoWindow = new VideoWindow();

        System.out.println(window.getImplementation().getClass().getName());
        window.showContent();
        videoWindow.showContent();

        window = new StandardWindow(new FirefoxWindowImplementation());
        videoWindow = new VideoWindow(new FirefoxWindowImplementation());
        window.showContent();
        videoWindow.showContent();

        videoWindow.setImplementation(new ChromeWindowImplementation());
        videoWindow.showContent();
    }
}
