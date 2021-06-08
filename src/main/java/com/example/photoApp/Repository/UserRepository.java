package com.example.photoApp.Repository;

import com.example.photoApp.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List <User> userList = new ArrayList<User>();
    public User getUser(){
        User user = new User("Parth" ,"Ahmedabad" ,22);
        return user;
    }

    public User saveUser(User user) {
        user.setUserId(userList.size() +1);
        userList.add(user);
        return user;
    }

    public List<User> getAllUser() {
        return userList;
    }

    public User getUserById(int userId) {
            for( User user :userList){
                if(user.getUserId() == userId){
                    return user;
                }
            }
            return null;

    }

    public User updateById(int userId, User user) {
        for(User u :userList){
            if(u.getUserId() == userId){
               u.setName(user.getName());
               u.setAddress(user.getAddress());
               u.setAge(user.getAge());
               return u;
            }
        }
        return null;
    }

    public User deleteById(int userId) {
        User deletedUser = null;
        for (User u  : userList){
             if(u.getUserId() == userId){
                    deletedUser=u;
                    userList.remove(u);
                    return deletedUser;
             }
        }
        return deletedUser;
    }
}
