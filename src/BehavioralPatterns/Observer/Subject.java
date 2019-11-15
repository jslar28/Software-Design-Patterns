package BehavioralPatterns.Observer;

import java.util.ArrayList;

class Subject {
    private int state = 0;
    private ArrayList<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer: observers) {
            observer.notifyObserver(state);
        }
    }

    void businessLogic() {
        state++;
        notifyObservers();
    }
}
