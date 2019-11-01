package StructuralPatterns.Bridge.ExampleA.GUIElements;

import StructuralPatterns.Bridge.ExampleA.OperatingSystems.OperatingSystem;

public class AdvancedButton extends Button {

    public AdvancedButton(OperatingSystem operatingSystem) {
        super(operatingSystem);
    }

    public void advancedClick() {
        operatingSystem.advancedAction();
    }
}
