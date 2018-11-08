/*
 * CyberSource Flex API
 * Simple PAN tokenization service
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
 * Ptsv2payoutsOrderInformationAmountDetailsSurcharge
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-08T03:47:28.632+05:30")
public class Ptsv2payoutsOrderInformationAmountDetailsSurcharge {
  @SerializedName("amount")
  private String amount = null;

  public Ptsv2payoutsOrderInformationAmountDetailsSurcharge amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The surcharge amount is included in the total transaction amount but is passed in a separate field to the issuer and acquirer for tracking. The issuer can provide information about the surcharge amount to the customer.  - Applicable only for CTV for Payouts. - CTV (&lt;&#x3D; 08)  For processor-specific information, see the surcharge_amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return amount
  **/
  @ApiModelProperty(value = "The surcharge amount is included in the total transaction amount but is passed in a separate field to the issuer and acquirer for tracking. The issuer can provide information about the surcharge amount to the customer.  - Applicable only for CTV for Payouts. - CTV (<= 08)  For processor-specific information, see the surcharge_amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2payoutsOrderInformationAmountDetailsSurcharge ptsv2payoutsOrderInformationAmountDetailsSurcharge = (Ptsv2payoutsOrderInformationAmountDetailsSurcharge) o;
    return Objects.equals(this.amount, ptsv2payoutsOrderInformationAmountDetailsSurcharge.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2payoutsOrderInformationAmountDetailsSurcharge {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

