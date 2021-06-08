package com.example.photoApp.Model;

public class User {
    private int age;
    private String name;
    private String address;
    public User(int age ,String name ,String address){
        this.address =address;
        this.age =age;
        this.name =name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
