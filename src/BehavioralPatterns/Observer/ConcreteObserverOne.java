package BehavioralPatterns.Observer;

class ConcreteObserverOne extends Observer {
    @Override
    void notifyObserver(int state) {
        System.out.println("ConcreteObserverOne notified");
    }
}
