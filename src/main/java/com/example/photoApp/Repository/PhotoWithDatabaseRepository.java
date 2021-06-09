package com.example.photoApp.Repository;

import com.example.photoApp.Model.PhotoWithDatabase;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoWithDatabaseRepository extends MongoRepository<PhotoWithDatabase ,String> {
}
