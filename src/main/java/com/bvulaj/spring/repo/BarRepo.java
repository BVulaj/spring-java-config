package com.bvulaj.spring.repo;

import org.springframework.stereotype.Component;

@Component
public class BarRepo {

    public String bar() {
        return "bar";
    }
}
