package com.harendra.autowire.autonnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAIN {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("com/harendra/autowire/autonnotation/config.xml");
        Student st = ap.getBean("st", Student.class);
        System.out.println(st); 
    }
}
