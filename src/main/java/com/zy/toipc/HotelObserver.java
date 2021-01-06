package com.zy.toipc;

public class HotelObserver implements Observer {

    @Override
    public void notify(SubjectEvent subjectEvent) {
        System.out.println("HotelObserver收到:"+subjectEvent.subject.toString()+"的"+subjectEvent.type);
    }
}
