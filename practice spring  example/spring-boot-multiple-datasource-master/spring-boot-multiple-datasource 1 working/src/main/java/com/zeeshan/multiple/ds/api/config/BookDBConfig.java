package com.zeeshan.multiple.ds.api.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
@Configuration
public class BookDBConfig {
	@Primary
	@Bean//(name = "bookDataSource")
	@ConfigurationProperties(prefix = "spring.book.datasource")
	public DataSource dataSource()
	{
		System.out.println("book db2 datasource");
		return DataSourceBuilder.create().build();
	}

	//@Primary
	@Bean//(name = "dataSource")
	@ConfigurationProperties(prefix = "spring.user.datasource")
	public DataSource dataSource1() {
		System.out.println("user  db1 datasource");
		return DataSourceBuilder.create().build();
	}
}
