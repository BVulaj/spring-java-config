package com.bvulaj.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bvulaj.spring.repo.BarRepo;
import com.bvulaj.spring.repo.FooRepo;

@Service // does the same thing as @Component, just a naming convention
public class FooBarService {

    private final BarRepo barRepo;
    private final FooRepo fooRepo;

    @Autowired
    public FooBarService(FooRepo fooRepo, BarRepo barRepo) {
        this.barRepo = barRepo;
        this.fooRepo = fooRepo;
    }

    public void printFoobar(){
        System.out.println(fooRepo.foo() + barRepo.bar());
    }
}
