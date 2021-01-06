//package com.zy.boot.config;
//
//import com.zy.boot.filter.BootFilter;
//import com.zy.boot.filter.BootFilter2;
//import com.zy.boot.interceptor.BootInterceptor;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
///**
// * 多个fliter 的执行顺序跟他先加入的顺序有关
// * 如下代码 boot filter 先执行 boot filter2 后执行
// * 在web.xml中只和他们的filter-mapping标签在web.xml文件中的顺序有关，靠上的配置的先执行。
// */
//@Configuration
//public class BootConfig extends WebMvcConfigurerAdapter {
//
//
//    @Bean
//    public FilterRegistrationBean addFilterBean(){
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new BootFilter());
//        filterRegistrationBean.addUrlPatterns("/*");
//        return filterRegistrationBean;
//    }
//
//    @Bean
//    public FilterRegistrationBean addFilter(){
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new BootFilter2());
//        filterRegistrationBean.addUrlPatterns("/*");
//        return filterRegistrationBean;
//    }
//
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new BootInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.html","/");
//    }
//}
