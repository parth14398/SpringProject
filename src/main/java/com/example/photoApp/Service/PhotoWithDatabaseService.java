package com.example.photoApp.Service;

import com.example.photoApp.Model.PhotoWithDatabase;
import com.example.photoApp.Repository.PhotoWithDatabaseRepository;
import com.example.photoApp.Resource.PhotoWithDatabaseResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhotoWithDatabaseService {
    @Autowired
    private PhotoWithDatabaseRepository photoWithDatabaseRepository;

    public List<PhotoWithDatabase> getData() {
        return  photoWithDatabaseRepository.findAll();
    }

    public PhotoWithDatabase savaData(PhotoWithDatabase photoWithDatabase) {
        return photoWithDatabaseRepository.save(photoWithDatabase);
    }

    public PhotoWithDatabase updateData(PhotoWithDatabase photoWithDatabase) {
        return photoWithDatabaseRepository.save(photoWithDatabase);
    }

    public void deleteData(String photoId) {
        photoWithDatabaseRepository.deleteById(photoId);
    }

    public Optional<PhotoWithDatabase> getDataById(String photoId) {
        return photoWithDatabaseRepository.findById(photoId);
    }
}
