package com.Spring.LearningHabits.FileUploadDownloadAPI.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-18T18:26:37.935292100+05:30[Asia/Calcutta]")
public class ErrorResponse   {
  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("error")
  private String error = null;

  @JsonProperty("errorMsgs")
  @Valid
  private List<String> errorMsgs = null;

  public ErrorResponse timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  
    public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public ErrorResponse error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  
    public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ErrorResponse errorMsgs(List<String> errorMsgs) {
    this.errorMsgs = errorMsgs;
    return this;
  }

  public ErrorResponse addErrorMsgsItem(String errorMsgsItem) {
    if (this.errorMsgs == null) {
      this.errorMsgs = new ArrayList<String>();
    }
    this.errorMsgs.add(errorMsgsItem);
    return this;
  }

  /**
   * Get errorMsgs
   * @return errorMsgs
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getErrorMsgs() {
    return errorMsgs;
  }

  public void setErrorMsgs(List<String> errorMsgs) {
    this.errorMsgs = errorMsgs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.timestamp, errorResponse.timestamp) &&
        Objects.equals(this.error, errorResponse.error) &&
        Objects.equals(this.errorMsgs, errorResponse.errorMsgs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, error, errorMsgs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorMsgs: ").append(toIndentedString(errorMsgs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
