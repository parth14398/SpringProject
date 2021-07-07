package com.example.photoApp.Model;
import com.example.photoApp.Validation.ValidName;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class UserWithDatabase {
    @Id
    private String id;
    @Min(value = 18) @Max(value = 45)
    private int age;
    @Length(max = 10)
    private String name;
    @NotEmpty @ValidName
    private String email;
    private String profilePhotoUrl ;

    public UserWithDatabase(String name , String email ,String profilePhotoUrl,int age){
        this.name = name;
        this.email = email;
        this.profilePhotoUrl = profilePhotoUrl;
        this.age=age;

    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }
}
