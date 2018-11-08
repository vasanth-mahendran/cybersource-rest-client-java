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
import Model.Ptsv2paymentsidrefundsProcessingInformationRecurringOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2creditsProcessingInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-08T03:47:28.632+05:30")
public class Ptsv2creditsProcessingInformation {
  @SerializedName("commerceIndicator")
  private String commerceIndicator = null;

  @SerializedName("processorId")
  private String processorId = null;

  @SerializedName("paymentSolution")
  private String paymentSolution = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("linkId")
  private String linkId = null;

  @SerializedName("reportGroup")
  private String reportGroup = null;

  @SerializedName("visaCheckoutId")
  private String visaCheckoutId = null;

  @SerializedName("purchaseLevel")
  private String purchaseLevel = null;

  @SerializedName("recurringOptions")
  private Ptsv2paymentsidrefundsProcessingInformationRecurringOptions recurringOptions = null;

  public Ptsv2creditsProcessingInformation commerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
    return this;
  }

   /**
   * Type of transaction. Some payment card companies use this information when determining discount rates. When you omit this field for **Ingenico ePayments**, the processor uses the default transaction type they have on file for you instead of the default value listed here. 
   * @return commerceIndicator
  **/
  @ApiModelProperty(value = "Type of transaction. Some payment card companies use this information when determining discount rates. When you omit this field for **Ingenico ePayments**, the processor uses the default transaction type they have on file for you instead of the default value listed here. ")
  public String getCommerceIndicator() {
    return commerceIndicator;
  }

  public void setCommerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
  }

  public Ptsv2creditsProcessingInformation processorId(String processorId) {
    this.processorId = processorId;
    return this;
  }

   /**
   * Value that identifies the processor/acquirer to use for the transaction. This value is supported only for **CyberSource through VisaNet**. 
   * @return processorId
  **/
  @ApiModelProperty(value = "Value that identifies the processor/acquirer to use for the transaction. This value is supported only for **CyberSource through VisaNet**. ")
  public String getProcessorId() {
    return processorId;
  }

  public void setProcessorId(String processorId) {
    this.processorId = processorId;
  }

  public Ptsv2creditsProcessingInformation paymentSolution(String paymentSolution) {
    this.paymentSolution = paymentSolution;
    return this;
  }

   /**
   * Type of digital payment solution that is being used for the transaction. Possible Values:   - **visacheckout**: Visa Checkout.  - **001**: Apple Pay.  - **005**: Masterpass. Required for Masterpass transactions on OmniPay Direct.  - **006**: Android Pay.  - **008**: Samsung Pay. 
   * @return paymentSolution
  **/
  @ApiModelProperty(value = "Type of digital payment solution that is being used for the transaction. Possible Values:   - **visacheckout**: Visa Checkout.  - **001**: Apple Pay.  - **005**: Masterpass. Required for Masterpass transactions on OmniPay Direct.  - **006**: Android Pay.  - **008**: Samsung Pay. ")
  public String getPaymentSolution() {
    return paymentSolution;
  }

  public void setPaymentSolution(String paymentSolution) {
    this.paymentSolution = paymentSolution;
  }

  public Ptsv2creditsProcessingInformation reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * Please check with Cybersource customer support to see if your merchant account is configured correctly so you can include this field in your request. * For Payouts: max length for FDCCompass is String (22). 
   * @return reconciliationId
  **/
  @ApiModelProperty(value = "Please check with Cybersource customer support to see if your merchant account is configured correctly so you can include this field in your request. * For Payouts: max length for FDCCompass is String (22). ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public Ptsv2creditsProcessingInformation linkId(String linkId) {
    this.linkId = linkId;
    return this;
  }

   /**
   * Value that links the current payment request to the original request. Set this value to the ID that was returned in the reply message from the original payment request.  This value is used for:   - Partial authorizations.  - Split shipments. 
   * @return linkId
  **/
  @ApiModelProperty(value = "Value that links the current payment request to the original request. Set this value to the ID that was returned in the reply message from the original payment request.  This value is used for:   - Partial authorizations.  - Split shipments. ")
  public String getLinkId() {
    return linkId;
  }

  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }

  public Ptsv2creditsProcessingInformation reportGroup(String reportGroup) {
    this.reportGroup = reportGroup;
    return this;
  }

   /**
   * Attribute that lets you define custom grouping for your processor reports. This field is supported only for **Litle**. 
   * @return reportGroup
  **/
  @ApiModelProperty(value = "Attribute that lets you define custom grouping for your processor reports. This field is supported only for **Litle**. ")
  public String getReportGroup() {
    return reportGroup;
  }

  public void setReportGroup(String reportGroup) {
    this.reportGroup = reportGroup;
  }

  public Ptsv2creditsProcessingInformation visaCheckoutId(String visaCheckoutId) {
    this.visaCheckoutId = visaCheckoutId;
    return this;
  }

   /**
   * Identifier for the **Visa Checkout** order. Visa Checkout provides a unique order ID for every transaction in the Visa Checkout **callID** field. 
   * @return visaCheckoutId
  **/
  @ApiModelProperty(value = "Identifier for the **Visa Checkout** order. Visa Checkout provides a unique order ID for every transaction in the Visa Checkout **callID** field. ")
  public String getVisaCheckoutId() {
    return visaCheckoutId;
  }

  public void setVisaCheckoutId(String visaCheckoutId) {
    this.visaCheckoutId = visaCheckoutId;
  }

  public Ptsv2creditsProcessingInformation purchaseLevel(String purchaseLevel) {
    this.purchaseLevel = purchaseLevel;
    return this;
  }

   /**
   * Set this field to 3 to indicate that the request includes Level III data.
   * @return purchaseLevel
  **/
  @ApiModelProperty(value = "Set this field to 3 to indicate that the request includes Level III data.")
  public String getPurchaseLevel() {
    return purchaseLevel;
  }

  public void setPurchaseLevel(String purchaseLevel) {
    this.purchaseLevel = purchaseLevel;
  }

  public Ptsv2creditsProcessingInformation recurringOptions(Ptsv2paymentsidrefundsProcessingInformationRecurringOptions recurringOptions) {
    this.recurringOptions = recurringOptions;
    return this;
  }

   /**
   * Get recurringOptions
   * @return recurringOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidrefundsProcessingInformationRecurringOptions getRecurringOptions() {
    return recurringOptions;
  }

  public void setRecurringOptions(Ptsv2paymentsidrefundsProcessingInformationRecurringOptions recurringOptions) {
    this.recurringOptions = recurringOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2creditsProcessingInformation ptsv2creditsProcessingInformation = (Ptsv2creditsProcessingInformation) o;
    return Objects.equals(this.commerceIndicator, ptsv2creditsProcessingInformation.commerceIndicator) &&
        Objects.equals(this.processorId, ptsv2creditsProcessingInformation.processorId) &&
        Objects.equals(this.paymentSolution, ptsv2creditsProcessingInformation.paymentSolution) &&
        Objects.equals(this.reconciliationId, ptsv2creditsProcessingInformation.reconciliationId) &&
        Objects.equals(this.linkId, ptsv2creditsProcessingInformation.linkId) &&
        Objects.equals(this.reportGroup, ptsv2creditsProcessingInformation.reportGroup) &&
        Objects.equals(this.visaCheckoutId, ptsv2creditsProcessingInformation.visaCheckoutId) &&
        Objects.equals(this.purchaseLevel, ptsv2creditsProcessingInformation.purchaseLevel) &&
        Objects.equals(this.recurringOptions, ptsv2creditsProcessingInformation.recurringOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commerceIndicator, processorId, paymentSolution, reconciliationId, linkId, reportGroup, visaCheckoutId, purchaseLevel, recurringOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2creditsProcessingInformation {\n");
    
    sb.append("    commerceIndicator: ").append(toIndentedString(commerceIndicator)).append("\n");
    sb.append("    processorId: ").append(toIndentedString(processorId)).append("\n");
    sb.append("    paymentSolution: ").append(toIndentedString(paymentSolution)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    reportGroup: ").append(toIndentedString(reportGroup)).append("\n");
    sb.append("    visaCheckoutId: ").append(toIndentedString(visaCheckoutId)).append("\n");
    sb.append("    purchaseLevel: ").append(toIndentedString(purchaseLevel)).append("\n");
    sb.append("    recurringOptions: ").append(toIndentedString(recurringOptions)).append("\n");
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

