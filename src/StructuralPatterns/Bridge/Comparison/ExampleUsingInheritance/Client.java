package StructuralPatterns.Bridge.Comparison.ExampleUsingInheritance;

public class Client {
    public static void main(String[] args) {
        Window chromeWindow = new ChromeWindow();
        Window firefoxWindow = new FirefoxWindow();
        Window chromeVideoWindow = new ChromeVideoWindow();
        Window firefoxVideoWindow = new FirefoxVideoWindow();

        chromeWindow.use();
        firefoxWindow.use();
        chromeVideoWindow.use();
        firefoxVideoWindow.use();
    }
}
