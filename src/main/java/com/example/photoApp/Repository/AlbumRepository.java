package com.example.photoApp.Repository;

import com.example.photoApp.Model.Album;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {
    List<Album> albumList =  new ArrayList<Album>();
    public List<Album> getAlbum() {
        if(albumList.size() ==0)
            return null;
        else
            return albumList;
    }

    public Album getAlbumById(int albumId) {
        for (Album a :albumList){
            if(a.getAlbumId() == albumId){
                return a;
            }
        }
        return null;
    }

    public Album postAlbum(Album album) {
        album.setAlbumId(albumList.size() + 1);
        albumList.add(album);
        return album;
    }

    public Album updateAlbum(int albumId, Album album) {
        for(Album a : albumList){
            if(a.getAlbumId() == albumId){
                a.setName(album.getName());
                a.setDescription(album.getDescription());
                a.setCoverPicUrl(album.getCoverPicUrl());
                return a ;
            }
        }
        return null;
    }

    public Album deletealbum(int albumId) {
        Album deleteAlbum = null;
        for(Album a : albumList){
            if(a.getAlbumId() == albumId){
                deleteAlbum =a;
                albumList.remove(a);
                return deleteAlbum;
            }
        }
        return deleteAlbum;
    }
}
