package com.example.photoApp.Resource;

import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.S3Object;
import com.example.photoApp.Service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/form")
public class FileResource {
    @Autowired
    private FileService fileService;

    @PostMapping
    public boolean upload(@RequestPart(value = "file", required = false) MultipartFile file){
        return fileService.postFile(file);
    }
    @GetMapping
    public void getFile(@RequestParam(name ="key" ) String key , HttpServletResponse response) throws IOException {
        S3Object object = fileService.getFile(key);
        response.setContentType(object.getObjectMetadata().getContentType());
        response.getOutputStream().write(object.getObjectContent().readAllBytes());

    }
    @GetMapping("/Download")
    public ResponseEntity<ByteArrayResource> download(@RequestParam (name ="key") String key) throws IOException {
        S3Object object = fileService.getFile(key);
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(object.getObjectMetadata().getContentType()))
                .header(Headers.CONTENT_DISPOSITION,"attachment;filename=\"" +key+"\"")
                .body(new ByteArrayResource(object.getObjectContent().readAllBytes()));

    }
    @DeleteMapping
    public void deleteFile(@RequestParam (name="key") String key){
        fileService.deleteFile(key);
    }
}
