package com.harendra.JDBC_Spring_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.JDBC_Spring_02.Dao.StudentDao;
import com.JDBC_Spring_02.Model.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new  ClassPathXmlApplicationContext("com/harendra/JDBC_Spring_02/config.xml");
        StudentDao dao= context.getBean("stDao",StudentDao.class);
	        Student st = new Student();
			st.setId(6);
			st.setEmail("Raka");
			st.setPassword("Uk");
	
			int i = dao.insert(st);
			System.out.println("insert sucessfully " + i);
    }
}
