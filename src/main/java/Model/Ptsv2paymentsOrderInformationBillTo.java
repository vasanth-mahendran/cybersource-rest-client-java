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
 * Ptsv2paymentsOrderInformationBillTo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-08T03:47:28.632+05:30")
public class Ptsv2paymentsOrderInformationBillTo {
  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("middleName")
  private String middleName = null;

  @SerializedName("nameSuffix")
  private String nameSuffix = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("company")
  private String company = null;

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

  @SerializedName("district")
  private String district = null;

  @SerializedName("buildingNumber")
  private String buildingNumber = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  /**
   * Customer&#39;s phone number type.  For Payouts: This field may be sent only for FDC Compass.  Possible Values -  * day * home * night * work 
   */
  @JsonAdapter(PhoneTypeEnum.Adapter.class)
  public enum PhoneTypeEnum {
    DAY("day"),
    
    HOME("home"),
    
    NIGHT("night"),
    
    WORK("work");

    private String value;

    PhoneTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PhoneTypeEnum fromValue(String text) {
      for (PhoneTypeEnum b : PhoneTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PhoneTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhoneTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhoneTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PhoneTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("phoneType")
  private PhoneTypeEnum phoneType = null;

  public Ptsv2paymentsOrderInformationBillTo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Customer’s first name. This name must be the same as the name on the card.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the customer_firstname field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return firstName
  **/
  @ApiModelProperty(value = "Customer’s first name. This name must be the same as the name on the card.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the customer_firstname field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Ptsv2paymentsOrderInformationBillTo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Customer’s last name. This name must be the same as the name on the card.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the customer_lastname field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return lastName
  **/
  @ApiModelProperty(value = "Customer’s last name. This name must be the same as the name on the card.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the customer_lastname field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Ptsv2paymentsOrderInformationBillTo middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Customer’s middle name. 
   * @return middleName
  **/
  @ApiModelProperty(value = "Customer’s middle name. ")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Ptsv2paymentsOrderInformationBillTo nameSuffix(String nameSuffix) {
    this.nameSuffix = nameSuffix;
    return this;
  }

   /**
   * Customer’s name suffix. 
   * @return nameSuffix
  **/
  @ApiModelProperty(value = "Customer’s name suffix. ")
  public String getNameSuffix() {
    return nameSuffix;
  }

  public void setNameSuffix(String nameSuffix) {
    this.nameSuffix = nameSuffix;
  }

  public Ptsv2paymentsOrderInformationBillTo title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title. 
   * @return title
  **/
  @ApiModelProperty(value = "Title. ")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Ptsv2paymentsOrderInformationBillTo company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Name of the customer’s company.  For processor-specific information, see the company_name field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return company
  **/
  @ApiModelProperty(value = "Name of the customer’s company.  For processor-specific information, see the company_name field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Ptsv2paymentsOrderInformationBillTo address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First line of the billing street address as it appears on the credit card issuer’s records.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the bill_address1 field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return address1
  **/
  @ApiModelProperty(value = "First line of the billing street address as it appears on the credit card issuer’s records.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the bill_address1 field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Ptsv2paymentsOrderInformationBillTo address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Additional address information.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the bill_address2 field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return address2
  **/
  @ApiModelProperty(value = "Additional address information.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the bill_address2 field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Ptsv2paymentsOrderInformationBillTo locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City of the billing address.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the bill_city field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return locality
  **/
  @ApiModelProperty(value = "City of the billing address.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the bill_city field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Ptsv2paymentsOrderInformationBillTo administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State or province of the billing address. Use the State, Province, and Territory Codes for the United States and Canada.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the bill_state field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "State or province of the billing address. Use the State, Province, and Territory Codes for the United States and Canada.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the bill_state field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Ptsv2paymentsOrderInformationBillTo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code for the billing address. The postal code must consist of 5 to 9 digits.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits]  Example 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric]  Example A1B 2C3  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the bill_zip field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code for the billing address. The postal code must consist of 5 to 9 digits.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits]  Example 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric]  Example A1B 2C3  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the bill_zip field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Ptsv2paymentsOrderInformationBillTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of the billing address. Use the two-character ISO Standard Country Codes.  For processor-specific information, see the bill_country field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return country
  **/
  @ApiModelProperty(value = "Country of the billing address. Use the two-character ISO Standard Country Codes.  For processor-specific information, see the bill_country field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Ptsv2paymentsOrderInformationBillTo district(String district) {
    this.district = district;
    return this;
  }

   /**
   * Customer’s neighborhood, community, or region (a barrio in Brazil) within the city or municipality. This field is available only on **Cielo**. 
   * @return district
  **/
  @ApiModelProperty(value = "Customer’s neighborhood, community, or region (a barrio in Brazil) within the city or municipality. This field is available only on **Cielo**. ")
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public Ptsv2paymentsOrderInformationBillTo buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

   /**
   * Building number in the street address.  This field is supported only for:  - Cielo transactions.  - Redecard customer validation with CyberSource Latin American Processing. 
   * @return buildingNumber
  **/
  @ApiModelProperty(value = "Building number in the street address.  This field is supported only for:  - Cielo transactions.  - Redecard customer validation with CyberSource Latin American Processing. ")
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public Ptsv2paymentsOrderInformationBillTo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Customer&#39;s email address, including the full domain name.  For processor-specific information, see the customer_email field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return email
  **/
  @ApiModelProperty(value = "Customer's email address, including the full domain name.  For processor-specific information, see the customer_email field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Ptsv2paymentsOrderInformationBillTo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Customer’s phone number.  For Payouts: This field may be sent only for FDC Compass.  CyberSource recommends that you include the country code when the order is from outside the U.S.  For processor-specific information, see the customer_phone field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Customer’s phone number.  For Payouts: This field may be sent only for FDC Compass.  CyberSource recommends that you include the country code when the order is from outside the U.S.  For processor-specific information, see the customer_phone field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Ptsv2paymentsOrderInformationBillTo phoneType(PhoneTypeEnum phoneType) {
    this.phoneType = phoneType;
    return this;
  }

   /**
   * Customer&#39;s phone number type.  For Payouts: This field may be sent only for FDC Compass.  Possible Values -  * day * home * night * work 
   * @return phoneType
  **/
  @ApiModelProperty(value = "Customer's phone number type.  For Payouts: This field may be sent only for FDC Compass.  Possible Values -  * day * home * night * work ")
  public PhoneTypeEnum getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(PhoneTypeEnum phoneType) {
    this.phoneType = phoneType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsOrderInformationBillTo ptsv2paymentsOrderInformationBillTo = (Ptsv2paymentsOrderInformationBillTo) o;
    return Objects.equals(this.firstName, ptsv2paymentsOrderInformationBillTo.firstName) &&
        Objects.equals(this.lastName, ptsv2paymentsOrderInformationBillTo.lastName) &&
        Objects.equals(this.middleName, ptsv2paymentsOrderInformationBillTo.middleName) &&
        Objects.equals(this.nameSuffix, ptsv2paymentsOrderInformationBillTo.nameSuffix) &&
        Objects.equals(this.title, ptsv2paymentsOrderInformationBillTo.title) &&
        Objects.equals(this.company, ptsv2paymentsOrderInformationBillTo.company) &&
        Objects.equals(this.address1, ptsv2paymentsOrderInformationBillTo.address1) &&
        Objects.equals(this.address2, ptsv2paymentsOrderInformationBillTo.address2) &&
        Objects.equals(this.locality, ptsv2paymentsOrderInformationBillTo.locality) &&
        Objects.equals(this.administrativeArea, ptsv2paymentsOrderInformationBillTo.administrativeArea) &&
        Objects.equals(this.postalCode, ptsv2paymentsOrderInformationBillTo.postalCode) &&
        Objects.equals(this.country, ptsv2paymentsOrderInformationBillTo.country) &&
        Objects.equals(this.district, ptsv2paymentsOrderInformationBillTo.district) &&
        Objects.equals(this.buildingNumber, ptsv2paymentsOrderInformationBillTo.buildingNumber) &&
        Objects.equals(this.email, ptsv2paymentsOrderInformationBillTo.email) &&
        Objects.equals(this.phoneNumber, ptsv2paymentsOrderInformationBillTo.phoneNumber) &&
        Objects.equals(this.phoneType, ptsv2paymentsOrderInformationBillTo.phoneType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, middleName, nameSuffix, title, company, address1, address2, locality, administrativeArea, postalCode, country, district, buildingNumber, email, phoneNumber, phoneType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsOrderInformationBillTo {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    nameSuffix: ").append(toIndentedString(nameSuffix)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
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

