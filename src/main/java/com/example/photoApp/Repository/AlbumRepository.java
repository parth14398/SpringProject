package com.example.photoApp.Repository;

import com.example.photoApp.Model.Album;
import org.springframework.stereotype.Repository;

@Repository
public class AlbumRepository {
    public Album getAlbum() {
        Album album = new Album(1,"Mypic","Personal", "myPicUrl");
        return album;
    }
}
