package com.example.photoApp.Service;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileService {
    public boolean postFile(MultipartFile file) {

        BasicAWSCredentials basicAWSCredentials = new BasicAWSCredentials("AKIARQ5G64GLAL6UI6SA","gxoqn7nnSioYGNp3hPC+woamF3diehmfx2lTgU12" );

        final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(basicAWSCredentials)).withRegion(Regions.US_EAST_2).build();
        try {
            ObjectMetadata objectMetadata = new ObjectMetadata();
            objectMetadata.setContentType(file.getContentType());
            objectMetadata.setContentLength(file.getSize());
            s3.putObject("backendgetmehired", file.getOriginalFilename(), file.getInputStream(),objectMetadata);
            return true;
        } catch (AmazonServiceException | IOException e) {
            return false;

        }

    }
    public S3Object getFile(String key){
        BasicAWSCredentials basicAWSCredentials = new BasicAWSCredentials("AKIARQ5G64GLAL6UI6SA","gxoqn7nnSioYGNp3hPC+woamF3diehmfx2lTgU12" );

        final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(basicAWSCredentials)).withRegion(Regions.US_EAST_2).build();
        return s3.getObject("backendgetmehired", key);
    }
    public void deleteFile(String key){
        BasicAWSCredentials basicAWSCredentials = new BasicAWSCredentials("AKIARQ5G64GLAL6UI6SA","gxoqn7nnSioYGNp3hPC+woamF3diehmfx2lTgU12" );

        final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(basicAWSCredentials)).withRegion(Regions.US_EAST_2).build();
        s3.deleteObject("backendgetmehired",key);
    }
}