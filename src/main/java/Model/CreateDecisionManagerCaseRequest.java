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
import Model.Riskv1decisionsBuyerInformation;
import Model.Riskv1decisionsCardVerification;
import Model.Riskv1decisionsClientReferenceInformation;
import Model.Riskv1decisionsDeviceInformation;
import Model.Riskv1decisionsMerchantDefinedInformation;
import Model.Riskv1decisionsOrderInformation;
import Model.Riskv1decisionsPaymentInformation;
import Model.Riskv1decisionsProcessorInformation;
import Model.Riskv1decisionsRiskInformation;
import Model.Riskv1decisionsTravelInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateDecisionManagerCaseRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-09T16:47:53.059+05:30")
public class CreateDecisionManagerCaseRequest {
  @SerializedName("clientReferenceInformation")
  private Riskv1decisionsClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("processorInformation")
  private Riskv1decisionsProcessorInformation processorInformation = null;

  @SerializedName("paymentInformation")
  private Riskv1decisionsPaymentInformation paymentInformation = null;

  @SerializedName("orderInformation")
  private Riskv1decisionsOrderInformation orderInformation = null;

  @SerializedName("buyerInformation")
  private Riskv1decisionsBuyerInformation buyerInformation = null;

  @SerializedName("deviceInformation")
  private Riskv1decisionsDeviceInformation deviceInformation = null;

  @SerializedName("cardVerification")
  private Riskv1decisionsCardVerification cardVerification = null;

  @SerializedName("riskInformation")
  private Riskv1decisionsRiskInformation riskInformation = null;

  @SerializedName("travelInformation")
  private Riskv1decisionsTravelInformation travelInformation = null;

  @SerializedName("merchantDefinedInformation")
  private List<Riskv1decisionsMerchantDefinedInformation> merchantDefinedInformation = null;

  public CreateDecisionManagerCaseRequest clientReferenceInformation(Riskv1decisionsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Riskv1decisionsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public CreateDecisionManagerCaseRequest processorInformation(Riskv1decisionsProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(Riskv1decisionsProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public CreateDecisionManagerCaseRequest paymentInformation(Riskv1decisionsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(Riskv1decisionsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public CreateDecisionManagerCaseRequest orderInformation(Riskv1decisionsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Riskv1decisionsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public CreateDecisionManagerCaseRequest buyerInformation(Riskv1decisionsBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(Riskv1decisionsBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }

  public CreateDecisionManagerCaseRequest deviceInformation(Riskv1decisionsDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
    return this;
  }

   /**
   * Get deviceInformation
   * @return deviceInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsDeviceInformation getDeviceInformation() {
    return deviceInformation;
  }

  public void setDeviceInformation(Riskv1decisionsDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
  }

  public CreateDecisionManagerCaseRequest cardVerification(Riskv1decisionsCardVerification cardVerification) {
    this.cardVerification = cardVerification;
    return this;
  }

   /**
   * Get cardVerification
   * @return cardVerification
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsCardVerification getCardVerification() {
    return cardVerification;
  }

  public void setCardVerification(Riskv1decisionsCardVerification cardVerification) {
    this.cardVerification = cardVerification;
  }

  public CreateDecisionManagerCaseRequest riskInformation(Riskv1decisionsRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
    return this;
  }

   /**
   * Get riskInformation
   * @return riskInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsRiskInformation getRiskInformation() {
    return riskInformation;
  }

  public void setRiskInformation(Riskv1decisionsRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
  }

  public CreateDecisionManagerCaseRequest travelInformation(Riskv1decisionsTravelInformation travelInformation) {
    this.travelInformation = travelInformation;
    return this;
  }

   /**
   * Get travelInformation
   * @return travelInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsTravelInformation getTravelInformation() {
    return travelInformation;
  }

  public void setTravelInformation(Riskv1decisionsTravelInformation travelInformation) {
    this.travelInformation = travelInformation;
  }

  public CreateDecisionManagerCaseRequest merchantDefinedInformation(List<Riskv1decisionsMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
    return this;
  }

  public CreateDecisionManagerCaseRequest addMerchantDefinedInformationItem(Riskv1decisionsMerchantDefinedInformation merchantDefinedInformationItem) {
    if (this.merchantDefinedInformation == null) {
      this.merchantDefinedInformation = new ArrayList<Riskv1decisionsMerchantDefinedInformation>();
    }
    this.merchantDefinedInformation.add(merchantDefinedInformationItem);
    return this;
  }

   /**
   * Get merchantDefinedInformation
   * @return merchantDefinedInformation
  **/
  @ApiModelProperty(value = "")
  public List<Riskv1decisionsMerchantDefinedInformation> getMerchantDefinedInformation() {
    return merchantDefinedInformation;
  }

  public void setMerchantDefinedInformation(List<Riskv1decisionsMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDecisionManagerCaseRequest createDecisionManagerCaseRequest = (CreateDecisionManagerCaseRequest) o;
    return Objects.equals(this.clientReferenceInformation, createDecisionManagerCaseRequest.clientReferenceInformation) &&
        Objects.equals(this.processorInformation, createDecisionManagerCaseRequest.processorInformation) &&
        Objects.equals(this.paymentInformation, createDecisionManagerCaseRequest.paymentInformation) &&
        Objects.equals(this.orderInformation, createDecisionManagerCaseRequest.orderInformation) &&
        Objects.equals(this.buyerInformation, createDecisionManagerCaseRequest.buyerInformation) &&
        Objects.equals(this.deviceInformation, createDecisionManagerCaseRequest.deviceInformation) &&
        Objects.equals(this.cardVerification, createDecisionManagerCaseRequest.cardVerification) &&
        Objects.equals(this.riskInformation, createDecisionManagerCaseRequest.riskInformation) &&
        Objects.equals(this.travelInformation, createDecisionManagerCaseRequest.travelInformation) &&
        Objects.equals(this.merchantDefinedInformation, createDecisionManagerCaseRequest.merchantDefinedInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, processorInformation, paymentInformation, orderInformation, buyerInformation, deviceInformation, cardVerification, riskInformation, travelInformation, merchantDefinedInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDecisionManagerCaseRequest {\n");
    
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
    sb.append("    deviceInformation: ").append(toIndentedString(deviceInformation)).append("\n");
    sb.append("    cardVerification: ").append(toIndentedString(cardVerification)).append("\n");
    sb.append("    riskInformation: ").append(toIndentedString(riskInformation)).append("\n");
    sb.append("    travelInformation: ").append(toIndentedString(travelInformation)).append("\n");
    sb.append("    merchantDefinedInformation: ").append(toIndentedString(merchantDefinedInformation)).append("\n");
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

