//package com.zy.boot.redis;
//
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.support.GenericXmlContextLoader;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:/application-redis.xml"}, loader = GenericXmlContextLoader.class)
//public class RedisTest {
//
//    @Autowired
//    RedisTemplate redisTemplate;
//    @Test
//    public void testRedis(){
////        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-redis.xml");
////
////        RedisTemplate redisTemplate = (RedisTemplate) applicationContext.getBean("redisTemplate");
//        Object zy = redisTemplate.opsForValue().get("zy");
//        System.out.println(zy);
//        System.out.println(redisTemplate);
//    }
//}
