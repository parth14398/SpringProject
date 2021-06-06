package com.example.photoApp.Resource;

import com.example.photoApp.Model.User;
import com.example.photoApp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public User getUser(){
        return userService.getUser();
    }
}
