package com.zy.strategy;


import org.springframework.stereotype.Component;

//@Component
//@TicketProviderSource(source = "xiechen")
public class XiechenTicketProvider implements TicketProvider {

    @Override
    public void autoTicket(Order order) {
        System.out.println("xiecheng ticket");
    }


}
