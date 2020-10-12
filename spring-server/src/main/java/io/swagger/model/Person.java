package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Person
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-11T14:51:52.833Z")




public class Person   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("idNumber")
  private Integer idNumber = null;

  public Person name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the person
   * @return name
  **/
  @ApiModelProperty(value = "The name of the person")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person idNumber(Integer idNumber) {
    this.idNumber = idNumber;
    return this;
  }

  /**
   * the id number of the person
   * @return idNumber
  **/
  @ApiModelProperty(value = "the id number of the person")


  public Integer getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(Integer idNumber) {
    this.idNumber = idNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.name, person.name) &&
        Objects.equals(this.idNumber, person.idNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, idNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
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

