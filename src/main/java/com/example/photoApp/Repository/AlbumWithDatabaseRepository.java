package com.example.photoApp.Repository;

import com.example.photoApp.Model.AlbumWithDatabase;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface AlbumWithDatabaseRepository extends MongoRepository <AlbumWithDatabase,String>{

}
