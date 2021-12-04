package com.sip.amsvermegdata.configuration;

import com.zaxxer.hikari.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import javax.sql.DataSource;
public class DatabaseConfig {
    @Value("${spring.datasource.url}")
    private String dbUrl="postgres://nmhygqasayofri:057d0982715d3f2653ed4d0b9d16785d9ee261cfab42ca5cbdad0584dee622fe@ec2-34-255-134-200.eu-west-1.compute.amazonaws.com:5432/d17fasebjlqgfn\n";
    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dbUrl);
        return new HikariDataSource(config);
    }

}
