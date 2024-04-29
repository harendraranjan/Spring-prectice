package com.harendra.collection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
	public static void main(String[] args){
		ApplicationContext cn	=new ClassPathXmlApplicationContext("config.xml");
		Student1 st=cn.getBean("myBean",Student1.class);
		System.out.print(st);
	}
}
