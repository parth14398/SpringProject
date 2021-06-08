package com.example.photoApp.Resource;

import com.example.photoApp.Model.User;
import com.example.photoApp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public User getUser(){
        return userService.getUser();
    }
    @PostMapping("/user")
    public  User saveUser(@RequestBody  User user){
        return userService.saveUser(user);
    }
    @GetMapping("/allUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/user/{userId}")
    public User getUserById(@PathVariable("userId") int userId ){
        return userService.getUserById(userId);
    }
    @PutMapping("user/{userId}")
    public User updateById(@PathVariable ("userId") int userId ,@RequestBody  User user ){
        return userService.updateById(userId ,user);
    }
    @DeleteMapping("/user")
    public User deleteById(@RequestParam (name = "userId") int userId){
        return userService.deleteById( userId);
    }
}
