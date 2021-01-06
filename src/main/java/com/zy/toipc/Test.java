package com.zy.toipc;

import java.lang.ref.SoftReference;

public class Test {

    public static void main(String[] a) {
        /*                  Observer                */
        HotelSubject hotelSubject = new HotelSubject();

        TrainSubject trainSubject = new TrainSubject();

        HotelObserver hotelObserver = new HotelObserver();

        TrainObserver trainObserver = new TrainObserver();

        trainSubject.addObserver(hotelObserver);

        trainSubject.addObserver(trainObserver);

        hotelSubject.addObserver(hotelObserver);

        trainSubject.hotelChangeEvent("酒店");



        /*                  softReference                */
        //HotelSubject hotelSubject = new HotelSubject();//SoftReference<HotelSubject> softReference = new SoftReference<HotelSubject>(hotelSubject);

        /*                  threadLocal                */
        ThreadLocal<HotelSubject> hotelSubjectThreadLocal = new ThreadLocal<>();

        new Thread(() -> {
            hotelSubjectThreadLocal.set(new HotelSubject("酒店主题1"));
            System.out.println(Thread.currentThread().getName() + "------" + hotelSubjectThreadLocal.get());
        }).start();

        new Thread(() -> {
            hotelSubjectThreadLocal.set(new HotelSubject("酒店主题2"));
            System.out.println(Thread.currentThread().getName() + "------" + hotelSubjectThreadLocal.get());
        }).start();

        HotelSubject hotelSubject1 = hotelSubjectThreadLocal.get();
        System.out.println(Thread.currentThread().getName() + "------" + hotelSubject1);

    }


}
