package com.example.photoApp.Resource;

import com.example.photoApp.Model.Album;
import com.example.photoApp.Model.AlbumWithDatabase;
import com.example.photoApp.Service.AlbumWithDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/albumWithDatabase")
public class AlbumWithDatabaseResource {
    @Autowired
    private AlbumWithDatabaseService albumWithDatabaseService;

    @GetMapping
    public List<AlbumWithDatabase> getData(){
        return albumWithDatabaseService.getData();
    }
    @PostMapping
    public AlbumWithDatabase saveData(@RequestBody AlbumWithDatabase albumWithDatabase){
        return albumWithDatabaseService.savaData(albumWithDatabase);
    }
    @PutMapping
    public AlbumWithDatabase updateData(@RequestBody AlbumWithDatabase albumWithDatabase){
        return albumWithDatabaseService.updateData(albumWithDatabase);
    }
    @DeleteMapping
    public void deleteData(@RequestParam (name="albumId") String id){
        albumWithDatabaseService.deleteData(id);
    }
    @GetMapping("/{albumId}")
    public Optional<AlbumWithDatabase> getDataById(@RequestParam (name="albumId") String albumId){
        return albumWithDatabaseService.getDataById(albumId);
    }

}
