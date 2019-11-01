package StructuralPatterns.Bridge.ExampleB.Views;

import StructuralPatterns.Bridge.ExampleB.Contents.Content;

public abstract class View {
    private Content content;

    View(Content content) {
        this.content = content;
        System.out.println("Window view constructed (abstract)");
    }

    public Content getContent() {
        return content;
    }
}
