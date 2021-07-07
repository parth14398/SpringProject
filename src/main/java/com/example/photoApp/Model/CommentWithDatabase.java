package com.example.photoApp.Model;

import com.example.photoApp.Validation.ValidName;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class CommentWithDatabase {
    private String id;
    private String photoId;
    @ValidName
    private String createdBy;
    private String dateCreated;
    @Min(5)
    private String message;

    public CommentWithDatabase(String photoId ,String createdBy ,String dateCreated ,String message){
        this.photoId =photoId ;
        this.createdBy =createdBy;
        this.dateCreated =dateCreated;
        this.message =message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
