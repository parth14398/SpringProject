package com.example.photoApp.Resource;

import com.example.photoApp.Model.AlbumWithDatabase;
import com.example.photoApp.Model.UserWithDatabase;
import com.example.photoApp.Service.AlbumWithDatabaseService;
import com.example.photoApp.Service.UserWithDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/UserWithDatabase")
public class UserWithDatabaseResource {
    @Autowired
    private UserWithDatabaseService userWithDatabaseService;

    @GetMapping
    public List<UserWithDatabase> getData(){
        return userWithDatabaseService.getData();
    }
    @PostMapping
    public UserWithDatabase saveData(@RequestBody  UserWithDatabase userWithDatabase){
        return userWithDatabaseService.savaData(userWithDatabase);
    }
    @PutMapping
    public UserWithDatabase  updateData(@RequestBody UserWithDatabase userWithDatabase){
        return userWithDatabaseService.updateData(userWithDatabase);
    }
    @DeleteMapping
    public void deleteData(@RequestParam (name="userId") String id){
        userWithDatabaseService.deleteData(id);
    }
    @GetMapping("/userById")
    public Optional<UserWithDatabase> getDataById(@RequestParam (name="UserId") String UserId){
        return userWithDatabaseService.getDataById(UserId);
    }
}
