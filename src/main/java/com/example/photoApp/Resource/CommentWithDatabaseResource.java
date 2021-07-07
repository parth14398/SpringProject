package com.example.photoApp.Resource;

import com.example.photoApp.Model.CommentWithDatabase;
import com.example.photoApp.Service.CommentWithDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/comment")
public class CommentWithDatabaseResource {
    @Autowired
    private CommentWithDatabaseService commentWithDatabaseService;

    @GetMapping
    public List<CommentWithDatabase> getData(){
        return commentWithDatabaseService.getData();
    }
    @PostMapping
    public  CommentWithDatabase saveData(@RequestBody @Valid CommentWithDatabase commentWithDatabase){
        return commentWithDatabaseService.saveData(commentWithDatabase);
    }

    @PutMapping
    public  CommentWithDatabase updateData(@RequestBody @Valid CommentWithDatabase commentWithDatabase){
        return commentWithDatabaseService.updateData(commentWithDatabase);
    }
    @DeleteMapping
    public void deleteData(@RequestParam (name = "commentId") String commentId){
        commentWithDatabaseService.deleteData(commentId);
    }
    @GetMapping ("/getById")
    public Optional<CommentWithDatabase> getDataById(@RequestParam (name ="commentId") String commentId){
        return commentWithDatabaseService.getDataById(commentId);

    }
}
