package StructuralPatterns.Proxy;

import StructuralPatterns.Proxy.Services.Proxy;
import StructuralPatterns.Proxy.Services.ServiceInterface;

public class Client {
    public static void main(String[] args) {
        ServiceInterface service = new Proxy();
        service.operation(true);
        service.operation(false);
    }
}
