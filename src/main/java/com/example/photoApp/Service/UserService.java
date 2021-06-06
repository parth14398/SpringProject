package com.example.photoApp.Service;

import com.example.photoApp.Model.User;
import com.example.photoApp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUser(){
        return userRepository.getUser();
    }
}
