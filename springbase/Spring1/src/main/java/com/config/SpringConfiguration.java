package com.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * 该类是配置类，作用和applicationContext.xml一样
 */
@Configuration
@ComponentScan("com.spring")
public class SpringConfiguration {
	@Bean(name = "runner")
	public QueryRunner creatQueryRunner (DataSource dataSource){
		return new QueryRunner(dataSource);
	}
	@Bean(name = "dataSource")
	public DataSource creatDateSource() {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		try {
			dataSource.setDriverClass("com.mysql.jdbc.Driver");
			dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/spring");
			dataSource.setUser("root");
			dataSource.setPassword("123456");
			return dataSource;
		} catch (PropertyVetoException e) {
			throw new RuntimeException(e);
		}

	}
}
