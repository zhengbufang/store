package com.zy.boot;

import com.zy.boot.bo.AutowireBean;
import com.zy.boot.bo.BootConditional;
import com.zy.boot.bo.ConditionBean;
import com.zy.boot.bo.ConditionBean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * 传统Spring 整合redis
 * 需要配置一连串的配置classpath:application-redis.xml
 * 连接工厂  连接池  redisTemplate
 */

@SpringBootApplication
@EnableAspectJAutoProxy
public class MainApplication {


    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public RedisTemplate<Object,Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<Object, Object> template = new RedisTemplate<>();
        template.setDefaultSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));
        template.setConnectionFactory(redisConnectionFactory);
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));
        template.setHashValueSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));
        return template;
    }

    @Bean
    public ConditionBean conditionBean() {
        System.out.println("conditionBean组件自动装配到容器中");
        return new ConditionBean();
    }

    @Bean
    @Conditional(BootConditional.class)   //判断容器中是否包含conditionBean 不包含的话不会注入这个ConditionBean2 bean
    public ConditionBean2 conditionBean2() {
        System.out.println("conditionBean 22222组件自动装配到容器中");
        return new ConditionBean2();
    }
}
