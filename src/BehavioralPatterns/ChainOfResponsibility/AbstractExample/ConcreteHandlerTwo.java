package BehavioralPatterns.ChainOfResponsibility.AbstractExample;

class ConcreteHandlerTwo extends Handler {
    ConcreteHandlerTwo(Handler nextHandler) {
        super(nextHandler);
        requestsToHandle = new Request[] { Request.X, Request.Y, Request.Z };
    }

    ConcreteHandlerTwo() {
        super();
    }

    @Override
    void handleRequest(Request request) {
        if (canHandleRequest(request)) {
            System.out.println("ConcreteHandlerTwo handles request"
                    + request.name());

            if (request == Request.Y) {
                forwardRequest(request);
            }
        } else {
            forwardRequest(request);
        }
    }
}