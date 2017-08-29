package com.spring.examples.service;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.PutObjectRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * Created by lulavillalobos on 6/27/17.
 */

@Service
public class FileUploadServiceImpl implements FileUploadService{

    //@Autowired
    //private AmazonS3Client s3Client;

    /*
    @Value("${aws_namecard_bucket}")
    private String nameCardBucket;

    @Value("${aws_access_key_id}")
    private String accessKey;

    @Value("${aws_secret_access_key}")
    String secretKey;
    */

    private String accessKey = "AKIAJ5MLI2INGYQLWHPA";
    private String secretKey = "g30OggpWLa7Y94vHhTPF3Rjv1KMlez1uqlnf+rTT";
    private String nameCardBucket = "examplelulav14";

    AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
    AmazonS3Client s3Client = new AmazonS3Client(credentials);

    //private static final String S3_BUCKET_NAME = "examplelulav14";

    public void saveFileToS3(String uploadFile, String fileName) {

        String fileNameInS3 = fileName;

        s3Client.putObject(new
                PutObjectRequest(nameCardBucket, fileNameInS3, new File(uploadFile)));
    }
}
