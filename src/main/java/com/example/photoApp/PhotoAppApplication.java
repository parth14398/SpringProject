package com.example.photoApp;

import com.example.photoApp.Repository.AlbumWithDatabaseRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.validation.annotation.Validated;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
//@EnableMongoRepositories(basePackageClasses = AlbumWithDatabaseRepository.class)
public class PhotoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppApplication.class, args);
	}

}
