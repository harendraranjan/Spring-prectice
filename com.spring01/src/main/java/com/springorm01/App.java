package com.springorm01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import springmvc.orm.dao.StudentDao;
import springmvc.orm.entity.Student;

public class App 
{
	 public static void main( String[] args )
	    {
	    	System.out.println( "-----------------------------------" );
	    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	    	StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
	    	Student student=new Student(123,"name","har");
	    	int i= studentDao.inssert(student);
	    	System.out.print(i);
	    	
	        
	    }
}
