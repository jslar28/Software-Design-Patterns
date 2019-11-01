package StructuralPatterns.Bridge.ExampleB;

import StructuralPatterns.Bridge.ExampleB.Contents.GameContent;
import StructuralPatterns.Bridge.ExampleB.Views.*;

public class Client {
    public static void main(String[] args) {
        GameContent content = new GameContent();
        View view = new MobileView(content);
        System.out.println(view.getContent());
    }
}
