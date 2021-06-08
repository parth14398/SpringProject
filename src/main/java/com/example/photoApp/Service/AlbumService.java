package com.example.photoApp.Service;

import com.example.photoApp.Model.Album;
import com.example.photoApp.Repository.AlbumRepository;
import org.springframework.stereotype.Service;

@Service
public class AlbumService {
    private AlbumRepository albumRepository;
    public  Album getAlbum() {
        return albumRepository.getAlbum();
    }
}
