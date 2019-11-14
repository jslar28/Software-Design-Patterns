package BehavioralPatterns.ChainOfResponsibility.AbstractExample;

abstract class Handler {
    private Handler nextHandler = null;
    Request[] requestsToHandle = {};

    Handler() {}

    Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    boolean canHandleRequest(Request requestToHandle) {
        for (Request request: requestsToHandle) {
            if (request == requestToHandle)
                return true;
        }
        return false;
    }

    void forwardRequest(Request request) {
        if (nextHandler != null)
            nextHandler.handleRequest(request);
        else
            System.out.println("Warning: No next handler");
    }

    abstract void handleRequest(Request request);
}
