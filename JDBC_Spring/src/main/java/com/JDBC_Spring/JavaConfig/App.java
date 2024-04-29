package com.JDBC_Spring.JavaConfig;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args ) throws SQLException{
    	ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
    	JdbcTemplate jd =context.getBean("jdbc",JdbcTemplate.class);
        System.out.println( jd.getDataSource().getConnection());
        
//        
//        String sql="INSERT INTO jdbc_spring(ID, email, password) VALUES (?, ?, ?)";
//        int i=jd.update(sql,"6","3har@gmail.ccom","har123");
//        System.out.print(i);

        
        
//	       String sql = "UPDATE jdbc_spring SET email=? WHERE ID=?";
//	       int i = jd.update(sql, "ranjan@gmail.com", 4);
//	      
//	       if (i > 0) {
//	           System.out.println("Success");
//	       } else {
//	           System.out.println("Fail");
//	        }
//	      }
        
        
	    String sql="DELETE FROM jdbc_spring where ID=?";
	    int i=jd.update(sql,5);
	    if (i > 0) {
	          System.out.println("Success");
	      } else {
	          System.out.println("Fail");
	      }
	    }
}
