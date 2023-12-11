package com.loweconnex.stringpalindrome.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.loweconnex.stringpalindrome.model.ErrorModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * InputStringResponse
 */

@JsonTypeName("inputStringResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-12-10T02:42:51.496236500Z[Europe/London]")
public class InputStringResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  private Boolean success;

  @Valid
  private List<@Valid ErrorModel> errors;

  public InputStringResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
  */
  
  @Schema(name = "success", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public InputStringResponse errors(List<@Valid ErrorModel> errors) {
    this.errors = errors;
    return this;
  }

  public InputStringResponse addErrorsItem(ErrorModel errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * A list of errors
   * @return errors
  */
  @Valid 
  @Schema(name = "errors", description = "A list of errors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid ErrorModel> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ErrorModel> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputStringResponse inputStringResponse = (InputStringResponse) o;
    return Objects.equals(this.success, inputStringResponse.success) &&
        Objects.equals(this.errors, inputStringResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputStringResponse {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

