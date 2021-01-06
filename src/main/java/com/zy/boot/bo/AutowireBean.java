package com.zy.boot.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AutowireBean {

    @Autowired
    TestAutowireBean testAutowireBean;

    @Autowired
    TestAutowireBean testAutowireBean2;


    @PostConstruct
    public void init(){
        System.out.println("testAutowireBean==testAutowireBean2:"+(testAutowireBean==testAutowireBean2));
    }



}
