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
import Model.Ptsv2payoutsOrderInformationAmountDetailsSurcharge;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2payoutsOrderInformationAmountDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-09T16:47:53.059+05:30")
public class Ptsv2payoutsOrderInformationAmountDetails {
  @SerializedName("totalAmount")
  private String totalAmount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("surcharge")
  private Ptsv2payoutsOrderInformationAmountDetailsSurcharge surcharge = null;

  public Ptsv2payoutsOrderInformationAmountDetails totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Grand total for the order. This value cannot be negative. You can include a decimal point (.), but no other special characters. CyberSource truncates the amount to the correct number of decimal places.  **Note** For CTV, FDCCompass, Paymentech processors, the maximum length for this field is 12.  **Important** Some processors have specific requirements and limitations, such as maximum amounts and maximum field lengths. This information is covered in:  Table 15, \&quot;Authorization Information for Specific Processors,\&quot; on page 43  Table 19, \&quot;Capture Information for Specific Processors,\&quot; on page 58  Table 23, \&quot;Credit Information for Specific Processors,\&quot; on page 75 If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen. See \&quot;Zero Amount Authorizations,\&quot; page 247.  **DCC with a Third-Party Provider**\\ Set this field to the converted amount that was returned by the DCC provider. You must include either this field or offer0 and the offerlevel field amount in your request. For details, see \&quot;Dynamic Currency Conversion with a Third Party Provider,\&quot; page 125.  **FDMS South**\\ If you accept IDR or CLP currencies, see the entry for FDMS South in Table 15, \&quot;Authorization Information for Specific Processors,\&quot; on page 43.  **DCC for First Data**\\ Not used. 
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Grand total for the order. This value cannot be negative. You can include a decimal point (.), but no other special characters. CyberSource truncates the amount to the correct number of decimal places.  **Note** For CTV, FDCCompass, Paymentech processors, the maximum length for this field is 12.  **Important** Some processors have specific requirements and limitations, such as maximum amounts and maximum field lengths. This information is covered in:  Table 15, \"Authorization Information for Specific Processors,\" on page 43  Table 19, \"Capture Information for Specific Processors,\" on page 58  Table 23, \"Credit Information for Specific Processors,\" on page 75 If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen. See \"Zero Amount Authorizations,\" page 247.  **DCC with a Third-Party Provider**\\ Set this field to the converted amount that was returned by the DCC provider. You must include either this field or offer0 and the offerlevel field amount in your request. For details, see \"Dynamic Currency Conversion with a Third Party Provider,\" page 125.  **FDMS South**\\ If you accept IDR or CLP currencies, see the entry for FDMS South in Table 15, \"Authorization Information for Specific Processors,\" on page 43.  **DCC for First Data**\\ Not used. ")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Ptsv2payoutsOrderInformationAmountDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency used for the order. Use the three-character ISO Standard Currency Codes.  For an authorization reversal (&#x60;reversalInformation&#x60;) or a capture (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60;), you must use the same currency that you used in your request for Payment API.  **DCC for First Data**\\ Your local currency. For details, see \&quot;Dynamic Currency Conversion for First Data,\&quot; page 113. 
   * @return currency
  **/
  @ApiModelProperty(value = "Currency used for the order. Use the three-character ISO Standard Currency Codes.  For an authorization reversal (`reversalInformation`) or a capture (`processingOptions.capture` is set to `true`), you must use the same currency that you used in your request for Payment API.  **DCC for First Data**\\ Your local currency. For details, see \"Dynamic Currency Conversion for First Data,\" page 113. ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Ptsv2payoutsOrderInformationAmountDetails surcharge(Ptsv2payoutsOrderInformationAmountDetailsSurcharge surcharge) {
    this.surcharge = surcharge;
    return this;
  }

   /**
   * Get surcharge
   * @return surcharge
  **/
  @ApiModelProperty(value = "")
  public Ptsv2payoutsOrderInformationAmountDetailsSurcharge getSurcharge() {
    return surcharge;
  }

  public void setSurcharge(Ptsv2payoutsOrderInformationAmountDetailsSurcharge surcharge) {
    this.surcharge = surcharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2payoutsOrderInformationAmountDetails ptsv2payoutsOrderInformationAmountDetails = (Ptsv2payoutsOrderInformationAmountDetails) o;
    return Objects.equals(this.totalAmount, ptsv2payoutsOrderInformationAmountDetails.totalAmount) &&
        Objects.equals(this.currency, ptsv2payoutsOrderInformationAmountDetails.currency) &&
        Objects.equals(this.surcharge, ptsv2payoutsOrderInformationAmountDetails.surcharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, currency, surcharge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2payoutsOrderInformationAmountDetails {\n");
    
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
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

