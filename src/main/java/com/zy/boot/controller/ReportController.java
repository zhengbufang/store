package com.zy.boot.controller;

import com.alibaba.fastjson.JSON;
import com.zy.boot.annotation.LogAnnotation;
import com.zy.boot.bo.BootBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    BootBean bootBean;

    //@LogAnnotation
    @RequestMapping("/list")
    public String getReportData(String username) {
        System.out.println("report:"+username);
        return "report";
    }


    @RequestMapping("/list2")
    public String getReportData2(String username) {
        System.out.println("report:"+username);
        if(bootBean != null) {
            System.out.println(JSON.toJSONString(bootBean));
        }
        return "report";
    }
}
