package StructuralPatterns.Bridge.ExampleA.OperatingSystems;

import StructuralPatterns.Bridge.ExampleA.GUIElements.GUIButton;

import java.util.ArrayList;

public interface OperatingSystem {
    ArrayList<GUIButton> guiElements = new ArrayList<>();
    void action();
    void advancedAction();
}
