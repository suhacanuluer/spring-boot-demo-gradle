package com.example.springbootdemogradle;

import com.example.springbootdemogradle.configurations.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
public class SpringBootDemoGradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoGradleApplication.class, args);
    }

}
