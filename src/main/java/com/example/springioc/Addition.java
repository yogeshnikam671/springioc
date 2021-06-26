package com.example.springioc;

import org.springframework.stereotype.Component;

@Component
public class Addition {

    public void add(int number) {
        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");
        System.out.println("Added " + number + "!");
        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");
    }

}
