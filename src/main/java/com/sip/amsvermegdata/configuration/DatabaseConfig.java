package com.sip.amsvermegdata.configuration;

import com.zaxxer.hikari.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import javax.sql.DataSource;
public class DatabaseConfig {
    @Value("${spring.datasource.url}")
    private String dbUrl="ec2-34-255-134-200.eu-west-1.compute.amazonaws.com";
    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dbUrl);
        return new HikariDataSource(config);
    }

}
