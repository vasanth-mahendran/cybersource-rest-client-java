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
import Model.Tmsv1instrumentidentifiersLinksSelf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Tmsv1instrumentidentifiersLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-08T03:47:28.632+05:30")
public class Tmsv1instrumentidentifiersLinks {
  @SerializedName("self")
  private Tmsv1instrumentidentifiersLinksSelf self = null;

  @SerializedName("ancestor")
  private Tmsv1instrumentidentifiersLinksSelf ancestor = null;

  @SerializedName("successor")
  private Tmsv1instrumentidentifiersLinksSelf successor = null;

  public Tmsv1instrumentidentifiersLinks self(Tmsv1instrumentidentifiersLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public Tmsv1instrumentidentifiersLinksSelf getSelf() {
    return self;
  }

  public void setSelf(Tmsv1instrumentidentifiersLinksSelf self) {
    this.self = self;
  }

  public Tmsv1instrumentidentifiersLinks ancestor(Tmsv1instrumentidentifiersLinksSelf ancestor) {
    this.ancestor = ancestor;
    return this;
  }

   /**
   * Get ancestor
   * @return ancestor
  **/
  @ApiModelProperty(value = "")
  public Tmsv1instrumentidentifiersLinksSelf getAncestor() {
    return ancestor;
  }

  public void setAncestor(Tmsv1instrumentidentifiersLinksSelf ancestor) {
    this.ancestor = ancestor;
  }

  public Tmsv1instrumentidentifiersLinks successor(Tmsv1instrumentidentifiersLinksSelf successor) {
    this.successor = successor;
    return this;
  }

   /**
   * Get successor
   * @return successor
  **/
  @ApiModelProperty(value = "")
  public Tmsv1instrumentidentifiersLinksSelf getSuccessor() {
    return successor;
  }

  public void setSuccessor(Tmsv1instrumentidentifiersLinksSelf successor) {
    this.successor = successor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv1instrumentidentifiersLinks tmsv1instrumentidentifiersLinks = (Tmsv1instrumentidentifiersLinks) o;
    return Objects.equals(this.self, tmsv1instrumentidentifiersLinks.self) &&
        Objects.equals(this.ancestor, tmsv1instrumentidentifiersLinks.ancestor) &&
        Objects.equals(this.successor, tmsv1instrumentidentifiersLinks.successor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, ancestor, successor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv1instrumentidentifiersLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    ancestor: ").append(toIndentedString(ancestor)).append("\n");
    sb.append("    successor: ").append(toIndentedString(successor)).append("\n");
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

