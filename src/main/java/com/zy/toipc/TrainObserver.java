package com.zy.toipc;

public class TrainObserver implements Observer{

    @Override
    public void notify(SubjectEvent subjectEvent) {
        System.out.println("TrainObserver收到:"+subjectEvent.subject.observers.size()+"的"+subjectEvent.type);
    }
}
