package com.mowgli.simplefileoperator;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.PutObjectRequest;

import static com.mowgli.simplefileoperator.common.LocalFileAccessor.getFileToUpload;

public class AWSFileUploader implements FileUploader {

    private static final String BUCKET_NAME = "simple-file-operator";

    @Override
    public void upload() {
        // https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/setup-credentials.html
        System.out.println("Uploading file to S3");
        AmazonS3 amazonS3 = AmazonS3Client.builder()
                                          .withCredentials(new DefaultAWSCredentialsProviderChain())
                                          .withRegion(Regions.US_EAST_1)
                                          .build();

        PutObjectRequest putObjectRequest = new PutObjectRequest(BUCKET_NAME, getFileToUpload().getName(), getFileToUpload());
        amazonS3.putObject(putObjectRequest);
    }
}
