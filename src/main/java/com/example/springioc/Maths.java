package com.example.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Maths {

    @Autowired
    Addition addition;

    public void addSomething(int number) {
        addition.add(number);
    }

}
