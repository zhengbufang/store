package com.zy.boot.aspect;

import com.alibaba.fastjson.JSON;
import com.zy.boot.annotation.LogAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Objects;

@Component
@Aspect
public class LogAspect {

    @Pointcut("@annotation(com.zy.boot.annotation.LogAnnotation)")
    public void pointcutMethod(){

    }
    @Before("pointcutMethod()")
    public void beforeMethod(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        LogAnnotation annotation = method.getAnnotation(LogAnnotation.class);
        if (Objects.isNull(annotation)) {
            return;
        }
        String methodName = method.getDeclaringClass().getSimpleName() + "." + method.getName();
        System.out.println(String.format("start {%s}：入参：{%s}", methodName, JSON.toJSONString(joinPoint.getArgs())));
    }

    @AfterReturning(value = "pointcutMethod() ",returning = "result")
    public void afterMethod(JoinPoint joinPoint,Object result){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        LogAnnotation annotation = method.getAnnotation(LogAnnotation.class);
        if (Objects.isNull(annotation)) {
            return;
        }
        String methodName = method.getDeclaringClass().getSimpleName() + "." + method.getName();
        System.out.println(String.format("start {%s}：返回：{%s}", methodName, JSON.toJSONString(result)));
    }

}
