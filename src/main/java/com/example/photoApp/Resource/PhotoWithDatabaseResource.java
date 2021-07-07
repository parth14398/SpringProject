package com.example.photoApp.Resource;

import com.example.photoApp.Model.PhotoWithDatabase;
import com.example.photoApp.Service.PhotoWithDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Photo")
public class PhotoWithDatabaseResource {
    @Autowired
    private PhotoWithDatabaseService photoWithDatabaseService;

    @GetMapping
    public List<PhotoWithDatabase> getData(){
        return photoWithDatabaseService.getData();
    }
    @PostMapping
    public PhotoWithDatabase savaData(@RequestBody @Valid PhotoWithDatabase photoWithDatabase){
        return photoWithDatabaseService.savaData(photoWithDatabase);
    }
    @PutMapping
    public PhotoWithDatabase updateData(@RequestBody @Valid PhotoWithDatabase photoWithDatabase){
        return photoWithDatabaseService.updateData(photoWithDatabase);
    }
    @DeleteMapping
    public void deleteData(@RequestParam (name ="photoId") String photoId){
        photoWithDatabaseService.deleteData(photoId);
    }
    @GetMapping("/photoId")
    public Optional<PhotoWithDatabase> getDataById (@RequestParam (name = "photoId") String photoId){
        return photoWithDatabaseService.getDataById(photoId);
    }
}
