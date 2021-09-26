package com.example.movieinformation.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MovieInformationConfig {


    @Autowired
    public MovieInformationConfig(DataSource dataSource) {
        Flyway.configure().baselineOnMigrate(true).dataSource(dataSource).load().migrate();
    }
}
