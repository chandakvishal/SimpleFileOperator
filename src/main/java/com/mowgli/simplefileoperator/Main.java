package com.mowgli.simplefileoperator;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Starting upload of file....");

        FileUploader fileUploader = new AWSFileUploader();
        fileUploader.upload();

        System.out.println("File Uploaded Successfully!");
    }
}
