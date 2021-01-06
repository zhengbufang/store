package com.zy.toipc;

public class HotelSubject extends Subject {


    public HotelSubject() {
    }

    public HotelSubject(String name) {
        super(name);
    }

    //酒店发生改变事 通知其他
    public void hotelChangeEvent(String source) {
        SubjectEvent subjectEvent = new SubjectEvent();

        /****
         *
         * 酒店改变的其他业务逻辑省略
         * 此处只写自身改变通知对其他类自己的变化
         *
         */
        subjectEvent.source = source;
        subjectEvent.type = SubjectEvent.GlobalEventType.UPDATE;
        subjectEvent.subject = this;
        notifyEventChange(subjectEvent);
    }

    @Override
    public String toString() {
        return "HotelSubject"+name;
    }
}
