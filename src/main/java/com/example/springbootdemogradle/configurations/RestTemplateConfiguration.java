package com.example.springbootdemogradle.configurations;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriTemplateHandler;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    public RestTemplate restTemplate(ApplicationProperties applicationProperties) {
        DefaultUriTemplateHandler defaultUriTemplateHandler = new DefaultUriTemplateHandler();
        defaultUriTemplateHandler.setBaseUrl(applicationProperties.getApiUrl());
        return new RestTemplateBuilder()
                .uriTemplateHandler(defaultUriTemplateHandler)
                .build();
    }
}
