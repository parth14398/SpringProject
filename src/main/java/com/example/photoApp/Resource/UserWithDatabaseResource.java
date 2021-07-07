package com.example.photoApp.Resource;

import com.example.photoApp.Exception.restrictedInfoClass;
import com.example.photoApp.Model.AlbumWithDatabase;
import com.example.photoApp.Model.UserWithDatabase;
import com.example.photoApp.Service.AlbumWithDatabaseService;
import com.example.photoApp.Service.UserWithDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
@Validated
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
    public UserWithDatabase saveData(@RequestBody @Valid UserWithDatabase userWithDatabase) throws restrictedInfoClass {
        if(userWithDatabase.getName().equalsIgnoreCase("root")){
            throw new restrictedInfoClass();
        }
        return userWithDatabaseService.savaData(userWithDatabase);
    }

    @PutMapping
    public UserWithDatabase  updateData(@RequestBody  @Valid UserWithDatabase userWithDatabase){
        return userWithDatabaseService.updateData(userWithDatabase);
    }

    @DeleteMapping
    public void deleteData(@RequestParam (name="userId") String id){
        userWithDatabaseService.deleteData(id);
    }


    @GetMapping("/name")
    public List<UserWithDatabase> getDataByname(@RequestParam (name="name") String name) throws restrictedInfoClass{
        if(name.equalsIgnoreCase("root")){
            throw new restrictedInfoClass();
        }
        return userWithDatabaseService.getDataByname(name);
    }


    @GetMapping("/userById")
    public UserWithDatabase getDataById(@RequestParam (name="UserId") String UserId){
        return userWithDatabaseService.getDataById(UserId).get();
    }

}
