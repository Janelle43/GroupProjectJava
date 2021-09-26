package com.example.moviebooking.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MovieBookingConfig {

    @Autowired
    public MovieBookingConfig(DataSource dataSource) {
        Flyway.configure().baselineOnMigrate(true).dataSource(dataSource).load().migrate();
    }
}
