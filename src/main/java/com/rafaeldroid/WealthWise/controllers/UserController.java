package com.rafaeldroid.WealthWise.controllers;

import com.rafaeldroid.WealthWise.models.User;
import com.rafaeldroid.WealthWise.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wealthwise/user")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<User> getAllUsers(){
        return userService.getUsers();
    }


}
