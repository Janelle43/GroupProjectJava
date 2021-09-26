package com.example.movierating.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MovieRatingConfig {

    @Autowired
    public MovieRatingConfig(DataSource dataSource) {
        Flyway.configure().baselineOnMigrate(true).dataSource(dataSource).load().migrate();
    }
}
