package com.harendra.reference;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		ApplicationContext cn	=new ClassPathXmlApplicationContext("config.xml");
		Student st=cn.getBean("st",Student.class);
		System.out.println(st);
		System.out.println(st.getAddress().getCity());
	}
}
