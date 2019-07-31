package com.qf.springboot_hello.config;

import com.qf.springboot_hello.filter.MyFilter;
import com.qf.springboot_hello.listener.MyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Oulingcheng
 * @Date 2019/7/29
 */
@Configuration
public class WebConfig {

    @Autowired
    private MyFilter myFilter;

    @Autowired
    private MyListener myListener;

    @Bean
    public FilterRegistrationBean registrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(myFilter);
        bean.setName("MyFilter");
        bean.addUrlPatterns("/*");
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean listenerRegistrationBean(){
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean();
        bean.setListener(myListener);
        return bean;
    }
}
