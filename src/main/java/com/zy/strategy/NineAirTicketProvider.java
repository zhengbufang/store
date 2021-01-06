package com.zy.strategy;


import org.springframework.stereotype.Component;

//@Component
//@TicketProviderSource(source = "9air")
public class NineAirTicketProvider implements TicketProvider {

    @Override
    public void autoTicket(Order order) {
        System.out.println("9air ticket");
    }


}
