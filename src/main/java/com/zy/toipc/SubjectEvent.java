package com.zy.toipc;


public class SubjectEvent {

    String source;
    GlobalEventType type;
    Subject subject;

    public enum  GlobalEventType {

        UPDATE(Object.class),DELETE(String.class),SELECT(Void.class);
        Class clazz;

        GlobalEventType(Class clazz) {
            this.clazz = clazz;
        }
    }
}
