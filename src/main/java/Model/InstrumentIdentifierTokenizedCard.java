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
import Model.TmsV1InstrumentIdentifiersPost200ResponseTokenizedCardCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The Network Token associated with the Instrument Identifier (PAN)
 */
@ApiModel(description = "The Network Token associated with the Instrument Identifier (PAN)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:10:54.851+05:30")
public class InstrumentIdentifierTokenizedCard {
  @SerializedName("state")
  private String state = null;

  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("card")
  private TmsV1InstrumentIdentifiersPost200ResponseTokenizedCardCard card = null;

  public InstrumentIdentifierTokenizedCard state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Issuer state for the Network Token Valid values: - ACTIVE - SUSPENDED - DELETED 
   * @return state
  **/
  @ApiModelProperty(example = "ACTIVE", value = "Issuer state for the Network Token Valid values: - ACTIVE - SUSPENDED - DELETED ")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

   /**
   * The Network Token expiration month, automatically updated
   * @return expirationMonth
  **/
  @ApiModelProperty(example = "12", value = "The Network Token expiration month, automatically updated")
  public String getExpirationMonth() {
    return expirationMonth;
  }

   /**
   * The Network Token expiration year, automatically updated
   * @return expirationYear
  **/
  @ApiModelProperty(example = "2025", value = "The Network Token expiration year, automatically updated")
  public String getExpirationYear() {
    return expirationYear;
  }

   /**
   * The Network Token brand Valid values: - visa - mastercard 
   * @return type
  **/
  @ApiModelProperty(example = "visa", value = "The Network Token brand Valid values: - visa - mastercard ")
  public String getType() {
    return type;
  }

  public InstrumentIdentifierTokenizedCard card(TmsV1InstrumentIdentifiersPost200ResponseTokenizedCardCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseTokenizedCardCard getCard() {
    return card;
  }

  public void setCard(TmsV1InstrumentIdentifiersPost200ResponseTokenizedCardCard card) {
    this.card = card;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentIdentifierTokenizedCard instrumentIdentifierTokenizedCard = (InstrumentIdentifierTokenizedCard) o;
    return Objects.equals(this.state, instrumentIdentifierTokenizedCard.state) &&
        Objects.equals(this.expirationMonth, instrumentIdentifierTokenizedCard.expirationMonth) &&
        Objects.equals(this.expirationYear, instrumentIdentifierTokenizedCard.expirationYear) &&
        Objects.equals(this.type, instrumentIdentifierTokenizedCard.type) &&
        Objects.equals(this.card, instrumentIdentifierTokenizedCard.card);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, expirationMonth, expirationYear, type, card);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentIdentifierTokenizedCard {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
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
