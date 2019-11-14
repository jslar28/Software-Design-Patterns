package BehavioralPatterns.ChainOfResponsibility.AbstractExample;

class ConcreteHandlerOne extends Handler {
    ConcreteHandlerOne(Handler nextHandler) {
        super(nextHandler);
        requestsToHandle = new Request[] { Request.X, Request.Y };
    }

    @Override
    void handleRequest(Request request) {
        if (canHandleRequest(request)) {
            System.out.println("ConcreteHandlerOne handles request"
                    + request.name());

            if (request == Request.Y) {
                forwardRequest(request);
            }
        } else {
            forwardRequest(request);
        }
    }
}
