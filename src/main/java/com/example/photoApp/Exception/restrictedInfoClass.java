package com.example.photoApp.Exception;

public class restrictedInfoClass extends Exception {
    @Override
    public String getMessage() {
        return "Restricted information";
    }
}
