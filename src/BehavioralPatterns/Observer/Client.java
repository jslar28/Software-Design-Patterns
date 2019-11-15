package BehavioralPatterns.Observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer concreteObserverOne = new ConcreteObserverOne();
        Observer concreteObserverTwo = new ConcreteObserverTwo();

        subject.addObserver(concreteObserverOne);
        subject.addObserver(concreteObserverTwo);
        subject.businessLogic();

        subject.removeObserver(concreteObserverTwo);
        subject.businessLogic();
    }
}
