package com.bvulaj.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bvulaj.spring.service.FooBarService;

public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        FooBarService svc = ctx.getBean(FooBarService.class);
        svc.printFoobar();
    }
}
