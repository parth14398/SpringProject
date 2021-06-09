package com.example.photoApp.Service;

import com.example.photoApp.Model.CommentWithDatabase;
import com.example.photoApp.Repository.CommentWithDatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentWithDatabaseService {
    @Autowired
    private CommentWithDatabaseRepository commentWithDatabaseRepository;
    public List<CommentWithDatabase> getData() {
        return commentWithDatabaseRepository.findAll();
    }

    public CommentWithDatabase saveData(CommentWithDatabase commentWithDatabase) {
        return commentWithDatabaseRepository.save(commentWithDatabase);
    }

    public CommentWithDatabase updateData(CommentWithDatabase commentWithDatabase) {
        return commentWithDatabaseRepository.save(commentWithDatabase);
    }

    public void deleteData(String commentId) {
        commentWithDatabaseRepository.deleteById(commentId);
    }

    public Optional<CommentWithDatabase> getDataById(String commentId) {
        return commentWithDatabaseRepository.findById(commentId);
    }
}
