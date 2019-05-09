/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Tmsv1instrumentidentifiersBillTo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-09T16:47:53.059+05:30")
public class Tmsv1instrumentidentifiersBillTo {
  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("country")
  private String country = null;

  public Tmsv1instrumentidentifiersBillTo address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First address line registered with card.
   * @return address1
  **/
  @ApiModelProperty(example = "8310 Capital of Texas Highway North", value = "First address line registered with card.")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Tmsv1instrumentidentifiersBillTo address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Second address line registered with card.
   * @return address2
  **/
  @ApiModelProperty(example = "Bluffstone Drive", value = "Second address line registered with card.")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Tmsv1instrumentidentifiersBillTo locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Locality registered with card.
   * @return locality
  **/
  @ApiModelProperty(example = "Austin", value = "Locality registered with card.")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Tmsv1instrumentidentifiersBillTo administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * Administrative area registered with card.
   * @return administrativeArea
  **/
  @ApiModelProperty(example = "TX", value = "Administrative area registered with card.")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Tmsv1instrumentidentifiersBillTo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code registered with card.
   * @return postalCode
  **/
  @ApiModelProperty(example = "78731", value = "Postal code registered with card.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Tmsv1instrumentidentifiersBillTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country registered with card.
   * @return country
  **/
  @ApiModelProperty(example = "US", value = "Country registered with card.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv1instrumentidentifiersBillTo tmsv1instrumentidentifiersBillTo = (Tmsv1instrumentidentifiersBillTo) o;
    return Objects.equals(this.address1, tmsv1instrumentidentifiersBillTo.address1) &&
        Objects.equals(this.address2, tmsv1instrumentidentifiersBillTo.address2) &&
        Objects.equals(this.locality, tmsv1instrumentidentifiersBillTo.locality) &&
        Objects.equals(this.administrativeArea, tmsv1instrumentidentifiersBillTo.administrativeArea) &&
        Objects.equals(this.postalCode, tmsv1instrumentidentifiersBillTo.postalCode) &&
        Objects.equals(this.country, tmsv1instrumentidentifiersBillTo.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, locality, administrativeArea, postalCode, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv1instrumentidentifiersBillTo {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

