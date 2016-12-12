package com.bvulaj.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bvulaj.spring.repo.FooRepo;

@Configuration
@ComponentScan
public class ApplicationConfig {

    // just demonstrating that we can define Beans this way, and through @Component
    // this way lets us config the bean manually
    @Bean
    public FooRepo fooRepo() {
        return new FooRepo();
    }

}
