package com.zjut.congif;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

//声明JdbcProperties是一个配置类
//指定jdbc属性文件的位置
//@Configuration
//@PropertySource(value = "classpath:jdbc.properties")
public class JdbcConfig {
	//为属性注入值
/*	@Value("${jdbc:mysql://localhost:3306/spring_boot?characterEncoding=utf-8&serverTimezone=UTC}")
	String url;
	@Value("${jdbc:com.mysql.cj.jdbc.DriverClassName}")
	String driverClassName;
	@Value("${jdbc:root}")
	String username;
	@Value("${jdbc:Wdc82563815}")
	String password;
	
	//将dataSource方法声明为一个注册Bean的方法，Spring会自动调用方法，并将其返回值加入Spring容器中
	@Bean(value = "dataSource1")
	public DataSource dataSource(){
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}*/
}
