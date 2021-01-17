package ro.darch.demo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetRecommendationResponseBody200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCustomCodegen", date = "2021-01-17T19:13:55.210+02:00")
public class GetRecommendationResponseBody200   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("url")
  private String url = null;

  public GetRecommendationResponseBody200 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Match
   * @return name
  **/
  @ApiModelProperty(value = "Name of the Match")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetRecommendationResponseBody200 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the Match
   * @return description
  **/
  @ApiModelProperty(value = "Description of the Match")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetRecommendationResponseBody200 url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Url of the match
   * @return url
  **/
  @ApiModelProperty(value = "Url of the match")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecommendationResponseBody200 getRecommendationResponseBody200 = (GetRecommendationResponseBody200) o;
    return Objects.equals(this.name, getRecommendationResponseBody200.name) &&
        Objects.equals(this.description, getRecommendationResponseBody200.description) &&
        Objects.equals(this.url, getRecommendationResponseBody200.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecommendationResponseBody200 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

