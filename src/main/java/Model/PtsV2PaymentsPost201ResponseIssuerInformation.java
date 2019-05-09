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
 * PtsV2PaymentsPost201ResponseIssuerInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-09T16:47:53.059+05:30")
public class PtsV2PaymentsPost201ResponseIssuerInformation {
  @SerializedName("country")
  private String country = null;

  @SerializedName("discretionaryData")
  private String discretionaryData = null;

  @SerializedName("responseCode")
  private String responseCode = null;

  public PtsV2PaymentsPost201ResponseIssuerInformation country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country in which the card was issued. This information enables you to determine whether the card was issued domestically or internationally. Use the two-character ISO Standard Country Codes.  This field is supported for Visa, Mastercard, Discover, Diners Club, JCB, and Maestro (International) on Chase Paymentech Solutions. 
   * @return country
  **/
  @ApiModelProperty(value = "Country in which the card was issued. This information enables you to determine whether the card was issued domestically or internationally. Use the two-character ISO Standard Country Codes.  This field is supported for Visa, Mastercard, Discover, Diners Club, JCB, and Maestro (International) on Chase Paymentech Solutions. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PtsV2PaymentsPost201ResponseIssuerInformation discretionaryData(String discretionaryData) {
    this.discretionaryData = discretionaryData;
    return this;
  }

   /**
   * Data defined by the issuer.  The value for this reply field will probably be the same as the value that you submitted in the authorization request, but it is possible for the processor, issuer, or acquirer to modify the value.  This field is supported only for Visa transactions on **CyberSource through VisaNet**.  For more information, see Appendix K, \&quot;Formats for  Discretionary Data,\&quot; on page 359. 
   * @return discretionaryData
  **/
  @ApiModelProperty(value = "Data defined by the issuer.  The value for this reply field will probably be the same as the value that you submitted in the authorization request, but it is possible for the processor, issuer, or acquirer to modify the value.  This field is supported only for Visa transactions on **CyberSource through VisaNet**.  For more information, see Appendix K, \"Formats for  Discretionary Data,\" on page 359. ")
  public String getDiscretionaryData() {
    return discretionaryData;
  }

  public void setDiscretionaryData(String discretionaryData) {
    this.discretionaryData = discretionaryData;
  }

  public PtsV2PaymentsPost201ResponseIssuerInformation responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Additional authorization code that must be printed on the receipt when returned by the processor.  This value is generated by the processor and is returned only for a successful transaction.  This field is supported only on FDC Nashville Global and SIX. 
   * @return responseCode
  **/
  @ApiModelProperty(value = "Additional authorization code that must be printed on the receipt when returned by the processor.  This value is generated by the processor and is returned only for a successful transaction.  This field is supported only on FDC Nashville Global and SIX. ")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseIssuerInformation ptsV2PaymentsPost201ResponseIssuerInformation = (PtsV2PaymentsPost201ResponseIssuerInformation) o;
    return Objects.equals(this.country, ptsV2PaymentsPost201ResponseIssuerInformation.country) &&
        Objects.equals(this.discretionaryData, ptsV2PaymentsPost201ResponseIssuerInformation.discretionaryData) &&
        Objects.equals(this.responseCode, ptsV2PaymentsPost201ResponseIssuerInformation.responseCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, discretionaryData, responseCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseIssuerInformation {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    discretionaryData: ").append(toIndentedString(discretionaryData)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
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

