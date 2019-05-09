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
import java.math.BigDecimal;

/**
 * Ptsv2paymentsidreversalsOrderInformationLineItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-09T16:47:53.059+05:30")
public class Ptsv2paymentsidreversalsOrderInformationLineItems {
  @SerializedName("quantity")
  private BigDecimal quantity = null;

  @SerializedName("unitPrice")
  private String unitPrice = null;

  public Ptsv2paymentsidreversalsOrderInformationLineItems quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Number of units for this order. For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when &#x60;orderInformation.lineItems[].productCode&#x60; is not set to &#x60;default&#x60; or one of the other values that are related to shipping and/or handling. When &#x60;orderInformation.lineItems[].productCode&#x60; is &#x60;gift_card&#x60;, this is the total count of individual prepaid gift cards purchased. 
   * minimum: 1
   * maximum: 9999999999
   * @return quantity
  **/
  @ApiModelProperty(value = "Number of units for this order. For an authorization or capture transaction (`processingOptions.capture` is set to `true` or `false`), this field is required when `orderInformation.lineItems[].productCode` is not set to `default` or one of the other values that are related to shipping and/or handling. When `orderInformation.lineItems[].productCode` is `gift_card`, this is the total count of individual prepaid gift cards purchased. ")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public Ptsv2paymentsidreversalsOrderInformationLineItems unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Per-item price of the product. This value cannot be negative. You can include a decimal point (.), but you cannot include any other special characters. CyberSource truncates the amount to the correct number of decimal places.  For processor-specific information, see the amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  **Important** Some processors have specific requirements and limitations, such as maximum amounts and maximum field lengths. This information is covered in: - Table 12, \&quot;Authorization Information for Specific Processors,\&quot; on page 36 - Table 16, \&quot;Capture Information for Specific Processors,\&quot; on page 51 - Table 20, \&quot;Credit Information for Specific Processors,\&quot; on page 65  **DCC for First Data**\\ This value is the original amount in your local currency. You must include this field. You cannot use grand_total_amount. See \&quot;Dynamic Currency Conversion for First Data,\&quot; page 113.  **FDMS South**\\ If you accept IDR or CLP currencies, see the entry for FDMS South in Table 12, \&quot;Authorization Information for Specific Processors,\&quot; on page 36.  **Zero Amount Authorizations**\\ If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen. See \&quot;Zero Amount Authorizations,\&quot; page 220. 
   * @return unitPrice
  **/
  @ApiModelProperty(value = "Per-item price of the product. This value cannot be negative. You can include a decimal point (.), but you cannot include any other special characters. CyberSource truncates the amount to the correct number of decimal places.  For processor-specific information, see the amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  **Important** Some processors have specific requirements and limitations, such as maximum amounts and maximum field lengths. This information is covered in: - Table 12, \"Authorization Information for Specific Processors,\" on page 36 - Table 16, \"Capture Information for Specific Processors,\" on page 51 - Table 20, \"Credit Information for Specific Processors,\" on page 65  **DCC for First Data**\\ This value is the original amount in your local currency. You must include this field. You cannot use grand_total_amount. See \"Dynamic Currency Conversion for First Data,\" page 113.  **FDMS South**\\ If you accept IDR or CLP currencies, see the entry for FDMS South in Table 12, \"Authorization Information for Specific Processors,\" on page 36.  **Zero Amount Authorizations**\\ If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen. See \"Zero Amount Authorizations,\" page 220. ")
  public String getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidreversalsOrderInformationLineItems ptsv2paymentsidreversalsOrderInformationLineItems = (Ptsv2paymentsidreversalsOrderInformationLineItems) o;
    return Objects.equals(this.quantity, ptsv2paymentsidreversalsOrderInformationLineItems.quantity) &&
        Objects.equals(this.unitPrice, ptsv2paymentsidreversalsOrderInformationLineItems.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, unitPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidreversalsOrderInformationLineItems {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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

