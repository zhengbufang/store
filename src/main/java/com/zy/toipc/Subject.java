package com.zy.toipc;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    String name;

    public Subject(String name) {
        this.name = name;
    }

    public Subject() {
    }

    List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyEventChange(SubjectEvent subjectEvent) {
        observers.forEach(observer -> observer.notify(subjectEvent));
    }

}
