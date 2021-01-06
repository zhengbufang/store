package com.zy.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//传统的Spring 整合redis 的方式
//@ImportResource(locations ="classpath:application-redis.xml")
@RequestMapping
@RestController
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/testRedis")
    public String testRedis() {
        Object value = redisTemplate.opsForValue().get("zy");
        System.out.println(value);
        return "1111";
    }
}
