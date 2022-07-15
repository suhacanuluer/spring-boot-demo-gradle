package com.example.springbootdemogradle.controllers;

import com.example.springbootdemogradle.RandomUser;
import com.example.springbootdemogradle.UserService;
import com.example.springbootdemogradle.controllers.response.RandomUserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public RandomUserResponse get() {
        RandomUser randomUser = this.userService.getRandomUser();
        return new RandomUserResponse(randomUser.firstName(), randomUser.lastName(), randomUser.email());
    }
}
