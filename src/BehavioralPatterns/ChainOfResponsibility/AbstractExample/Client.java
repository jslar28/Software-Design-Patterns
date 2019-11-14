package BehavioralPatterns.ChainOfResponsibility.AbstractExample;

public class Client {
    public static void main(String[] args) {
        Handler lastHandler = new ConcreteHandlerTwo();
        Handler handler = new ConcreteHandlerOne(lastHandler);
        handler.handleRequest(Request.X);
        handler.handleRequest(Request.Y);
        handler.handleRequest(Request.Z);
    }
}
