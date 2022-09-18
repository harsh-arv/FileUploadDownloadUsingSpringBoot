package com.Spring.LearningHabits.FileUploadDownloadAPI.controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import java.net.MalformedURLException;

import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class DownloadFileController implements DownloadFileApi {

    private byte [] filedata={1,2,3};

    @Override
    public ResponseEntity<Resource> downloadFile() throws MalformedURLException {
        Resource resource = null;
        String path= "src/main/resources/HarshID Card_2.pdf";
        Path foundFile=Paths.get(path);

        if (foundFile != null) {
           resource= new UrlResource(foundFile.toUri());
        }
        String contentType = "application/octet-stream";
        String headerValue = "attachment; filename=\"" + resource.getFilename() + "\"";
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, headerValue)
                .body(resource);

    }


}
