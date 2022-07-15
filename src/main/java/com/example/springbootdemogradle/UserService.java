package com.example.springbootdemogradle;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserService {

    private final RestTemplate restTemplate;

    public UserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public RandomUser getRandomUser() {
        return this.restTemplate.getForObject("/users/random_user", RandomUser.class);
    }
}
