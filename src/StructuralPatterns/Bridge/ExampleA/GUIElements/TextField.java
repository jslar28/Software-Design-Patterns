package StructuralPatterns.Bridge.ExampleA.GUIElements;

import StructuralPatterns.Bridge.ExampleA.OperatingSystems.OperatingSystem;

public class TextField extends GUIButton {
    public TextField(OperatingSystem operatingSystem) {
        super(operatingSystem);
    }

    public void focus() {
        System.out.println("<place cursor here>");
    }

    @Override
    void click() {

    }
}
