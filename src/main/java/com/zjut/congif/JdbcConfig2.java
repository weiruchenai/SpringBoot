package com.zjut.congif;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.xml.crypto.Data;


//@Configuration
//@EnableConfigurationProperties(JdbcProperties.class) //声明自己定义的这个对象
public class JdbcConfig2 {
/*	@Bean(value = "dataSource2")
	public DataSource dataSource(JdbcProperties jdbcProperties) {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(jdbcProperties.getDriver());
		dataSource.setUrl(jdbcProperties.getUrl());
		dataSource.setUsername(jdbcProperties.getUsername());
		dataSource.setPassword(jdbcProperties.getPassword());
		return dataSource;
	}*/
	
/*	@Bean(value = "dataSource2")
	@ConfigurationProperties(prefix = "jdbc")
	public DataSource dataSource(){
		return new DruidDataSource();
	}*/
}
