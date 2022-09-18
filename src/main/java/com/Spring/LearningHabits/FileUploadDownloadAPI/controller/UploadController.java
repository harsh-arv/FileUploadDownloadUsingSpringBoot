package com.Spring.LearningHabits.FileUploadDownloadAPI.controller;

import com.Spring.LearningHabits.FileUploadDownloadAPI.models.FileDisplayDetails;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


@RestController
public class UploadController implements UploadFileApi{

    @Override
    public ResponseEntity<FileDisplayDetails> uploadDocument(MultipartFile file) throws IOException {
        Path uploadPath = Paths.get("Files-Upload");
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
        try (InputStream inputStream = file.getInputStream()) {
            Path filePath = uploadPath.resolve(file.getOriginalFilename());
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
            FileDisplayDetails fileDisplayDetails=new FileDisplayDetails();
            fileDisplayDetails.setFileName(file.getOriginalFilename());
            fileDisplayDetails.setDocUuid("Saving here..."+uploadPath+"check in Same directory");
            fileDisplayDetails.setFileCategory(file.getContentType());
            System.out.println(fileDisplayDetails);
        return new ResponseEntity<>(fileDisplayDetails,HttpStatus.OK);}
        catch (Exception e){
            e.getStackTrace();
            throw e;
        }
    }
}
