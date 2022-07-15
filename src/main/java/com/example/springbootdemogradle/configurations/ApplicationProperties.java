package com.example.springbootdemogradle.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app")
public class ApplicationProperties {
    private String apiUrl;

    public ApplicationProperties() {
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }
}
