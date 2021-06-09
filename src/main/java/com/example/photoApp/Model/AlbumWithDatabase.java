package com.example.photoApp.Model;

import nonapi.io.github.classgraph.json.Id;

public class AlbumWithDatabase {
        @Id
        private String id;
        private String name;
        private String coverPhotoUrl;
        private String dateCreated;
        private String createdBy;

        public AlbumWithDatabase(String name ,String coverPhotoUrl ,String dateCreated ,String createdBy){
            this.name = name;
            this.coverPhotoUrl = coverPhotoUrl;
            this.dateCreated =dateCreated;
            this.createdBy = createdBy;
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

    public String getCoverPhotoUrl() {
        return coverPhotoUrl;
    }

    public void setCoverPhotoUrl(String coverPhotoUrl) {
        this.coverPhotoUrl = coverPhotoUrl;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
