package StructuralPatterns.Bridge.ExampleA;

import StructuralPatterns.Bridge.ExampleA.GUIElements.*;
import StructuralPatterns.Bridge.ExampleA.OperatingSystems.Linux;
import StructuralPatterns.Bridge.ExampleA.OperatingSystems.OperatingSystem;
import StructuralPatterns.Bridge.ExampleA.OperatingSystems.Windows;

public class Client {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new Windows();
        testButtons(operatingSystem);
        operatingSystem = new Linux();
        testButtons(operatingSystem);
    }

    private static void testButtons(OperatingSystem operatingSystem) {
        Button button = new Button(operatingSystem);
        button.click();

        AdvancedButton advancedButton = new AdvancedButton(operatingSystem);
        advancedButton.click();
        advancedButton.advancedClick();
    }
}
