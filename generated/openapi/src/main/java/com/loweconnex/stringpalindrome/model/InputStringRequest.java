package com.loweconnex.stringpalindrome.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InputStringRequest
 */

@JsonTypeName("inputStringRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-12-10T02:42:51.496236500Z[Europe/London]")
public class InputStringRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private String inputString;

  public InputStringRequest inputString(String inputString) {
    this.inputString = inputString;
    return this;
  }

  /**
   * Get inputString
   * @return inputString
  */
  
  @Schema(name = "inputString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inputString")
  public String getInputString() {
    return inputString;
  }

  public void setInputString(String inputString) {
    this.inputString = inputString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputStringRequest inputStringRequest = (InputStringRequest) o;
    return Objects.equals(this.inputString, inputStringRequest.inputString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputStringRequest {\n");
    sb.append("    inputString: ").append(toIndentedString(inputString)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

