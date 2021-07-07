package com.example.photoApp.Repository;

import com.example.photoApp.Model.UserWithDatabase;
import com.example.photoApp.Resource.UserWithDatabaseResource;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserWithDatabaseRepository  extends MongoRepository<UserWithDatabase,String> {

    List<UserWithDatabase> findByName(String name);
}
