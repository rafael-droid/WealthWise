package com.rafaeldroid.WealthWise.controllers;

import com.rafaeldroid.WealthWise.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wealthwise/user")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;


}