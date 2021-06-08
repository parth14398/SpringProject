package com.example.photoApp.Resource;

import com.example.photoApp.Model.Album;
import com.example.photoApp.Service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumResource {
    @Autowired
    private AlbumService albumService;

    @GetMapping("/album")
    public List<Album> getAlbum(){
        return albumService.getAlbum();
    }

    @GetMapping("/album/{albumId}")
    public Album getAlbumById(@PathVariable ("albumId") int albumId){
        return albumService.getAlbumById(albumId);
    }

    @PostMapping("/album")
    public Album postAlbum(@RequestBody  Album album){
        return albumService.postAlbum(album);
    }
    @PutMapping("/album/{albumId}")
    public Album updateAlbum (@PathVariable ("albumId") int albumId ,@RequestBody Album album){
        return albumService.updateAlbum(albumId ,album);
    }
    @DeleteMapping("/album")
    public Album deleteAlbum(@RequestParam (name ="albumId") int albumId){
            return albumService.deleteAlbum(albumId);
    }

}
