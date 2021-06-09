package com.example.photoApp.Repository;

import com.example.photoApp.Model.CommentWithDatabase;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentWithDatabaseRepository extends MongoRepository<CommentWithDatabase ,String> {
}
