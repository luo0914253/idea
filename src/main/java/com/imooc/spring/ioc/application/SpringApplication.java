package com.imooc.spring.ioc.application;

import com.imooc.spring.ioc.entity.Apple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Apple sourApple = context.getBean("sourApple", Apple.class);
        System.out.println(sourApple.getTitle());
    }
}
