package com.example.photoApp.Repository;

import com.example.photoApp.Model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User getUser() {
        User user = new User(21, "Parth" ,"Ahmedabad");
        return user;
    }
}
