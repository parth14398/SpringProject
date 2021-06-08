package com.example.photoApp.Service;

import com.example.photoApp.Model.User;
import com.example.photoApp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUser(){
        return userRepository.getUser();
    }

    public User saveUser(User user) {
        return userRepository.saveUser(user);
    }

    public List<User> getAllUser() {
        return userRepository.getAllUser();
    }

    public User getUserById(int userId) {
        return userRepository.getUserById(userId);
    }

    public User updateById(int userId, User user) {
        return userRepository.updateById(userId ,user);
    }

    public User deleteById(int userId) {
        return userRepository.deleteById(userId);
    }
}
