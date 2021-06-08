package com.example.photoApp.Service;

import com.example.photoApp.Model.Album;
import com.example.photoApp.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepository;
    public List<Album> getAlbum() {
        return albumRepository.getAlbum();
    }

    public Album getAlbumById(int albumId) {
        return albumRepository.getAlbumById(albumId);
    }

    public Album postAlbum(Album album) {
        return albumRepository.postAlbum(album);
    }

    public Album updateAlbum(int albumId, Album album) {
        return albumRepository.updateAlbum(albumId,album);
    }

    public Album deleteAlbum(int albumId) {
        return albumRepository.deletealbum(albumId);
    }
}
