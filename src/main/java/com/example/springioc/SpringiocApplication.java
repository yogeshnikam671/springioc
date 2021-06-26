package com.example.springioc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringiocApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.example.springioc");
        appContext.refresh();
        Maths maths = appContext.getBean(Maths.class);
        maths.addSomething(5);
    }

}
