package BehavioralPatterns.Observer;

class ConcreteObserverTwo extends Observer {
    @Override
    void notifyObserver(int state) {
        System.out.println("ConcreteObserverTwo notified");
    }
}
