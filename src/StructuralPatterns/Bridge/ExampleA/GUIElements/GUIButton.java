package StructuralPatterns.Bridge.ExampleA.GUIElements;

import StructuralPatterns.Bridge.ExampleA.OperatingSystems.OperatingSystem;

public abstract class GUIButton {
    public OperatingSystem operatingSystem;
    public GUIButton(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    abstract void click();
}
