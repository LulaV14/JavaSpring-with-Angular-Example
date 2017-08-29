package com.spring.examples.service;

/**
 * Created by lulavillalobos on 6/28/17.
 */
public interface FileUploadService {

    public void saveFileToS3(String uploadFile, String fileName);
}
