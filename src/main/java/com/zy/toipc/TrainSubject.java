package com.zy.toipc;

public class TrainSubject extends Subject{

    //酒店发生改变事 通知其他
    public void hotelChangeEvent(String source) {
        SubjectEvent subjectEvent = new SubjectEvent();

        /****
         *
         * 火车票改变的其他业务逻辑省略
         * 此处只写自身改变通知对其他类自己的变化
         *
         */
        subjectEvent.source = source;
        subjectEvent.type = SubjectEvent.GlobalEventType.DELETE;
        subjectEvent.subject = this;
        notifyEventChange(subjectEvent);
    }
}
