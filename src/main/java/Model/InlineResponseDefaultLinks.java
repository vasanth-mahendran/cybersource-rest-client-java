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
import Model.InlineResponseDefaultLinksNext;
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
 * InlineResponseDefaultLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-09T16:47:53.059+05:30")
public class InlineResponseDefaultLinks {
  @SerializedName("next")
  private List<InlineResponseDefaultLinksNext> next = null;

  @SerializedName("documentation")
  private List<InlineResponseDefaultLinksNext> documentation = null;

  @SerializedName("self")
  private InlineResponseDefaultLinksNext self = null;

  public InlineResponseDefaultLinks next(List<InlineResponseDefaultLinksNext> next) {
    this.next = next;
    return this;
  }

  public InlineResponseDefaultLinks addNextItem(InlineResponseDefaultLinksNext nextItem) {
    if (this.next == null) {
      this.next = new ArrayList<InlineResponseDefaultLinksNext>();
    }
    this.next.add(nextItem);
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponseDefaultLinksNext> getNext() {
    return next;
  }

  public void setNext(List<InlineResponseDefaultLinksNext> next) {
    this.next = next;
  }

  public InlineResponseDefaultLinks documentation(List<InlineResponseDefaultLinksNext> documentation) {
    this.documentation = documentation;
    return this;
  }

  public InlineResponseDefaultLinks addDocumentationItem(InlineResponseDefaultLinksNext documentationItem) {
    if (this.documentation == null) {
      this.documentation = new ArrayList<InlineResponseDefaultLinksNext>();
    }
    this.documentation.add(documentationItem);
    return this;
  }

   /**
   * Get documentation
   * @return documentation
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponseDefaultLinksNext> getDocumentation() {
    return documentation;
  }

  public void setDocumentation(List<InlineResponseDefaultLinksNext> documentation) {
    this.documentation = documentation;
  }

  public InlineResponseDefaultLinks self(InlineResponseDefaultLinksNext self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public InlineResponseDefaultLinksNext getSelf() {
    return self;
  }

  public void setSelf(InlineResponseDefaultLinksNext self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponseDefaultLinks inlineResponseDefaultLinks = (InlineResponseDefaultLinks) o;
    return Objects.equals(this.next, inlineResponseDefaultLinks.next) &&
        Objects.equals(this.documentation, inlineResponseDefaultLinks.documentation) &&
        Objects.equals(this.self, inlineResponseDefaultLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, documentation, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponseDefaultLinks {\n");
    
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

