package com.harendra.primitive;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		ApplicationContext cn	=new ClassPathXmlApplicationContext("config.xml");
		Student st=cn.getBean("myBean",Student.class);
		System.out.print(st);
	}
}