package com.Spring.LearningHabits.FileUploadDownloadAPI.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FileDisplayDetails
 */
@Validated
@Data
public class FileDisplayDetails {
  @JsonProperty("docUuid")
  private String docUuid = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("fileCategory")
  private String fileCategory = null;

}