package com.JDBC_Spring;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args ) throws SQLException{
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/JDBC_Spring/config.xml");
    	JdbcTemplate jd =context.getBean("jdbcTemplate",JdbcTemplate.class);
        System.out.println( jd.getDataSource().getConnection());
      
//        String sql="INSERT INTO jdbc_spring(ID, email, password) VALUES (?, ?, ?)";
//        int i=jd.update(sql,"5","5har@gmail.ccom","har123");
//        System.out.print(i);
        
        
        
//        String sql = "UPDATE jdbc_spring SET email=? WHERE ID=?";
//        int i = jd.update(sql, "Harendra@gmail.com", 3);
//        
//        if (i > 0) {
//            System.out.println("Success");
//        } else {
//            System.out.println("Fail");
//        }
        
        String sql="DELETE FROM jdbc_spring where ID=?";
        int i=jd.update(sql,6);
        if (i > 0) {
	          System.out.println("Success");
	      } else {
	          System.out.println("Fail");
	      }
	    }
}
