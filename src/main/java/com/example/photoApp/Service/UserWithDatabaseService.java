package com.example.photoApp.Service;

import com.example.photoApp.Model.UserWithDatabase;
import com.example.photoApp.Repository.UserWithDatabaseRepository;
import com.example.photoApp.Resource.UserWithDatabaseResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserWithDatabaseService {
    @Autowired
    private UserWithDatabaseRepository userWithDatabaseRepository;
    public List<UserWithDatabase> getData() {
        return userWithDatabaseRepository.findAll();
    }

    public UserWithDatabase savaData(UserWithDatabase userWithDatabase) {
        return userWithDatabaseRepository.save(userWithDatabase);
    }

    public UserWithDatabase updateData(UserWithDatabase userWithDatabase) {
        return userWithDatabaseRepository.save(userWithDatabase);
    }

    public void deleteData(String id) {
        userWithDatabaseRepository.deleteById(id);
    }

    public Optional<UserWithDatabase> getDataById(String userId) {
        return userWithDatabaseRepository.findById(userId);
    }
}
