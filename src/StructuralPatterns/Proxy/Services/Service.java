package StructuralPatterns.Proxy.Services;

public class Service implements ServiceInterface {
    Service() { }

    @Override
    public void operation(boolean allowed) {
        System.out.println("Operation on target object");
    }
}
