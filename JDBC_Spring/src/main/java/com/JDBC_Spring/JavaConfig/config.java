package com.JDBC_Spring.JavaConfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class config {
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/jdbc_db?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
		
	}
	@Bean("jdbc")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(getDataSource());
		return jd;
	}
}
