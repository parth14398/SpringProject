package com.example.photoApp.Model;

import nonapi.io.github.classgraph.json.Id;

public class UserWithDatabase {
    @Id
    private String id;
    private String name;
    private String email;
    private String profilePhotoUrl ;

    public UserWithDatabase(String name , String email ,String profilePhotoUrl){
        this.name = name;
        this.email = email;
        this.profilePhotoUrl = profilePhotoUrl;

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
