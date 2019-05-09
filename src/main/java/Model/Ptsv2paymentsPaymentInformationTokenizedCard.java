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
 * Ptsv2paymentsPaymentInformationTokenizedCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-09T16:47:53.059+05:30")
public class Ptsv2paymentsPaymentInformationTokenizedCard {
  @SerializedName("number")
  private String number = null;

  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("cryptogram")
  private String cryptogram = null;

  @SerializedName("requestorId")
  private String requestorId = null;

  @SerializedName("transactionType")
  private String transactionType = null;

  @SerializedName("assuranceLevel")
  private String assuranceLevel = null;

  @SerializedName("storageMethod")
  private String storageMethod = null;

  @SerializedName("securityCode")
  private String securityCode = null;

  public Ptsv2paymentsPaymentInformationTokenizedCard number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Customer’s payment network token value. 
   * @return number
  **/
  @ApiModelProperty(value = "Customer’s payment network token value. ")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Two-digit month in which the payment network token expires. &#x60;Format: MM&#x60;. Possible values: 01 through 12.  **Barclays and Streamline**\\ For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (01 through 12) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  **Encoded Account Numbers**\\ For encoded account numbers (_type_&#x3D;039), if there is no expiration date on the card, use 12.  For processor-specific information, see the customer_cc_expmo field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return expirationMonth
  **/
  @ApiModelProperty(value = "Two-digit month in which the payment network token expires. `Format: MM`. Possible values: 01 through 12.  **Barclays and Streamline**\\ For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (01 through 12) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  **Encoded Account Numbers**\\ For encoded account numbers (_type_=039), if there is no expiration date on the card, use 12.  For processor-specific information, see the customer_cc_expmo field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Four-digit year in which the payment network token expires. &#x60;Format: YYYY&#x60;.  **Barclays and Streamline**\\ For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (1900 through 3000) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  **FDC Nashville Global and FDMS South**\\ You can send in 2 digits or 4 digits. If you send in 2 digits, they must be the last 2 digits of the year.  **Encoded Account Numbers**\\ For encoded account numbers (card_type&#x3D;039), if there is no expiration date on the card, use 2021.  For processor-specific information, see the customer_cc_expyr field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return expirationYear
  **/
  @ApiModelProperty(value = "Four-digit year in which the payment network token expires. `Format: YYYY`.  **Barclays and Streamline**\\ For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (1900 through 3000) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  **FDC Nashville Global and FDMS South**\\ You can send in 2 digits or 4 digits. If you send in 2 digits, they must be the last 2 digits of the year.  **Encoded Account Numbers**\\ For encoded account numbers (card_type=039), if there is no expiration date on the card, use 2021.  For processor-specific information, see the customer_cc_expyr field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of card to authorize. - 001 Visa - 002 Mastercard - 003 Amex - 004 Discover - 005: Diners Club - 007: JCB - 024: Maestro (UK Domestic) - 039 Encoded account number - 042: Maestro (International) 
   * @return type
  **/
  @ApiModelProperty(value = "Type of card to authorize. - 001 Visa - 002 Mastercard - 003 Amex - 004 Discover - 005: Diners Club - 007: JCB - 024: Maestro (UK Domestic) - 039 Encoded account number - 042: Maestro (International) ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard cryptogram(String cryptogram) {
    this.cryptogram = cryptogram;
    return this;
  }

   /**
   * This field is used internally.
   * @return cryptogram
  **/
  @ApiModelProperty(value = "This field is used internally.")
  public String getCryptogram() {
    return cryptogram;
  }

  public void setCryptogram(String cryptogram) {
    this.cryptogram = cryptogram;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard requestorId(String requestorId) {
    this.requestorId = requestorId;
    return this;
  }

   /**
   * Value that identifies your business and indicates that the cardholder’s account number is tokenized. This value is assigned by the token service provider and is unique within the token service provider’s database.  &#x60;Note&#x60; This field is supported only for **CyberSource through VisaNet** and **FDC Nashville Global**. 
   * @return requestorId
  **/
  @ApiModelProperty(value = "Value that identifies your business and indicates that the cardholder’s account number is tokenized. This value is assigned by the token service provider and is unique within the token service provider’s database.  `Note` This field is supported only for **CyberSource through VisaNet** and **FDC Nashville Global**. ")
  public String getRequestorId() {
    return requestorId;
  }

  public void setRequestorId(String requestorId) {
    this.requestorId = requestorId;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Type of transaction that provided the token data. This value does not specify the token service provider; it specifies the entity that provided you with information about the token.  Set the value for this field to 1. An application on the customer’s mobile device provided the token data. 
   * @return transactionType
  **/
  @ApiModelProperty(value = "Type of transaction that provided the token data. This value does not specify the token service provider; it specifies the entity that provided you with information about the token.  Set the value for this field to 1. An application on the customer’s mobile device provided the token data. ")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard assuranceLevel(String assuranceLevel) {
    this.assuranceLevel = assuranceLevel;
    return this;
  }

   /**
   * Confidence level of the tokenization. This value is assigned by the token service provider.  &#x60;Note&#x60; This field is supported only for **CyberSource through VisaNet** and **FDC Nashville Global**. 
   * @return assuranceLevel
  **/
  @ApiModelProperty(value = "Confidence level of the tokenization. This value is assigned by the token service provider.  `Note` This field is supported only for **CyberSource through VisaNet** and **FDC Nashville Global**. ")
  public String getAssuranceLevel() {
    return assuranceLevel;
  }

  public void setAssuranceLevel(String assuranceLevel) {
    this.assuranceLevel = assuranceLevel;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard storageMethod(String storageMethod) {
    this.storageMethod = storageMethod;
    return this;
  }

   /**
   * Type of technology used in the device to store token data. Possible values:   - 001: Secure Element (SE)  Smart card or memory with restricted access and encryption to prevent data tampering. For storing payment credentials, a SE is tested against a set of requirements defined by the payment networks.  &#x60;Note&#x60; This field is supported only for **FDC Compass**.  - 002: Host Card Emulation (HCE)  Emulation of a smart card by using software to create a virtual and exact representation of the card. Sensitive data is stored in a database that is hosted in the cloud. For storing payment credentials, a database must meet very stringent security requirements that exceed PCI DSS.  &#x60;Note&#x60; This field is supported only for **FDC Compass**. 
   * @return storageMethod
  **/
  @ApiModelProperty(value = "Type of technology used in the device to store token data. Possible values:   - 001: Secure Element (SE)  Smart card or memory with restricted access and encryption to prevent data tampering. For storing payment credentials, a SE is tested against a set of requirements defined by the payment networks.  `Note` This field is supported only for **FDC Compass**.  - 002: Host Card Emulation (HCE)  Emulation of a smart card by using software to create a virtual and exact representation of the card. Sensitive data is stored in a database that is hosted in the cloud. For storing payment credentials, a database must meet very stringent security requirements that exceed PCI DSS.  `Note` This field is supported only for **FDC Compass**. ")
  public String getStorageMethod() {
    return storageMethod;
  }

  public void setStorageMethod(String storageMethod) {
    this.storageMethod = storageMethod;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard securityCode(String securityCode) {
    this.securityCode = securityCode;
    return this;
  }

   /**
   * Card Verification Number.  **Ingenico ePayments** Do not include this field when _commerceIndicator&#x3D;recurring_. **Note** Ingenico ePayments was previously called Global Collect. CVN. 
   * @return securityCode
  **/
  @ApiModelProperty(value = "Card Verification Number.  **Ingenico ePayments** Do not include this field when _commerceIndicator=recurring_. **Note** Ingenico ePayments was previously called Global Collect. CVN. ")
  public String getSecurityCode() {
    return securityCode;
  }

  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsPaymentInformationTokenizedCard ptsv2paymentsPaymentInformationTokenizedCard = (Ptsv2paymentsPaymentInformationTokenizedCard) o;
    return Objects.equals(this.number, ptsv2paymentsPaymentInformationTokenizedCard.number) &&
        Objects.equals(this.expirationMonth, ptsv2paymentsPaymentInformationTokenizedCard.expirationMonth) &&
        Objects.equals(this.expirationYear, ptsv2paymentsPaymentInformationTokenizedCard.expirationYear) &&
        Objects.equals(this.type, ptsv2paymentsPaymentInformationTokenizedCard.type) &&
        Objects.equals(this.cryptogram, ptsv2paymentsPaymentInformationTokenizedCard.cryptogram) &&
        Objects.equals(this.requestorId, ptsv2paymentsPaymentInformationTokenizedCard.requestorId) &&
        Objects.equals(this.transactionType, ptsv2paymentsPaymentInformationTokenizedCard.transactionType) &&
        Objects.equals(this.assuranceLevel, ptsv2paymentsPaymentInformationTokenizedCard.assuranceLevel) &&
        Objects.equals(this.storageMethod, ptsv2paymentsPaymentInformationTokenizedCard.storageMethod) &&
        Objects.equals(this.securityCode, ptsv2paymentsPaymentInformationTokenizedCard.securityCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, expirationMonth, expirationYear, type, cryptogram, requestorId, transactionType, assuranceLevel, storageMethod, securityCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsPaymentInformationTokenizedCard {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
    sb.append("    requestorId: ").append(toIndentedString(requestorId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    assuranceLevel: ").append(toIndentedString(assuranceLevel)).append("\n");
    sb.append("    storageMethod: ").append(toIndentedString(storageMethod)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
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

