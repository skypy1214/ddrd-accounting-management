package com.ddrdaccountingmanagement.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .username("admin")
                .password("1q2w3e4r!")
                .url("jdbc:mysql://database-ddrd.crqzg9d1kmc5.ap-northeast-2.rds.amazonaws.com:3306/ddrd_database?characterEncoding=utf8")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .build()
                ;
    }
}