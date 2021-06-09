package com.example.photoApp.Service;

import com.example.photoApp.Model.AlbumWithDatabase;
import com.example.photoApp.Repository.AlbumWithDatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumWithDatabaseService {
    @Autowired
    private AlbumWithDatabaseRepository albumWithDatabaseRepository;

    public AlbumWithDatabase savaData(AlbumWithDatabase albumWithDatabase) {
        return albumWithDatabaseRepository.save(albumWithDatabase);
    }

    public List<AlbumWithDatabase> getData() {
        return albumWithDatabaseRepository.findAll();
    }

    public AlbumWithDatabase updateData(AlbumWithDatabase albumWithDatabase) {
        return albumWithDatabaseRepository.save(albumWithDatabase);
    }

    public void deleteData(String id) {
         albumWithDatabaseRepository.deleteById(id);
    }

    public Optional<AlbumWithDatabase> getDataById(String albumId) {
       return albumWithDatabaseRepository.findById(albumId);
    }
}
