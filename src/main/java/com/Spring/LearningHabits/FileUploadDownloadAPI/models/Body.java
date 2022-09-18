package com.Spring.LearningHabits.FileUploadDownloadAPI.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import org.springframework.core.io.Resource;
import org.springframework.validation.annotation.Validated;




@Validated
@Data
public class Body   {
  @JsonProperty("file")
  private Resource file = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("fileCategory")
  private Resource fileCategory = null;
  @JsonProperty("fileData")
  private byte[] fileData = null;
}
