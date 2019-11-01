package StructuralPatterns.Bridge.ExampleA.GUIElements;

import StructuralPatterns.Bridge.ExampleA.OperatingSystems.OperatingSystem;

public class Button extends GUIButton {
    public Button(OperatingSystem operatingSystem) {
        super(operatingSystem);
    }

    public void click() {
        operatingSystem.action();
    }
}
