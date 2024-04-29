package com.harendra.autowire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext acn=new ClassPathXmlApplicationContext("com/harendra/autowire/xml/config.xml");
		Student stu= acn.getBean("st",Student.class);
		System.out.print(stu);
	}

}
