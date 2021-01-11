/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1.dto;

import java.util.Objects;
import java.util.Arrays;
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
import org.wso2.am.integration.clients.publisher.api.v1.dto.APIRevisionAPIInfoDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.APIRevisionDeploymentDTO;

/**
 * APIRevisionDTO
 */

public class APIRevisionDTO {
  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("createdTime")
  private String createdTime = null;

  @SerializedName("apiInfo")
  private APIRevisionAPIInfoDTO apiInfo = null;

  @SerializedName("deploymentInfo")
  private List<APIRevisionDeploymentDTO> deploymentInfo = null;

  public APIRevisionDTO displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "REVISION 1", value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public APIRevisionDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "c26b2b9b-4632-4ca4-b6f3-521c8863990c", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public APIRevisionDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "removed a post resource", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public APIRevisionDTO createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @ApiModelProperty(value = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public APIRevisionDTO apiInfo(APIRevisionAPIInfoDTO apiInfo) {
    this.apiInfo = apiInfo;
    return this;
  }

   /**
   * Get apiInfo
   * @return apiInfo
  **/
  @ApiModelProperty(value = "")
  public APIRevisionAPIInfoDTO getApiInfo() {
    return apiInfo;
  }

  public void setApiInfo(APIRevisionAPIInfoDTO apiInfo) {
    this.apiInfo = apiInfo;
  }

  public APIRevisionDTO deploymentInfo(List<APIRevisionDeploymentDTO> deploymentInfo) {
    this.deploymentInfo = deploymentInfo;
    return this;
  }

  public APIRevisionDTO addDeploymentInfoItem(APIRevisionDeploymentDTO deploymentInfoItem) {
    if (this.deploymentInfo == null) {
      this.deploymentInfo = new ArrayList<>();
    }
    this.deploymentInfo.add(deploymentInfoItem);
    return this;
  }

   /**
   * Get deploymentInfo
   * @return deploymentInfo
  **/
  @ApiModelProperty(value = "")
  public List<APIRevisionDeploymentDTO> getDeploymentInfo() {
    return deploymentInfo;
  }

  public void setDeploymentInfo(List<APIRevisionDeploymentDTO> deploymentInfo) {
    this.deploymentInfo = deploymentInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIRevisionDTO apIRevision = (APIRevisionDTO) o;
    return Objects.equals(this.displayName, apIRevision.displayName) &&
        Objects.equals(this.id, apIRevision.id) &&
        Objects.equals(this.description, apIRevision.description) &&
        Objects.equals(this.createdTime, apIRevision.createdTime) &&
        Objects.equals(this.apiInfo, apIRevision.apiInfo) &&
        Objects.equals(this.deploymentInfo, apIRevision.deploymentInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, id, description, createdTime, apiInfo, deploymentInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIRevisionDTO {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    apiInfo: ").append(toIndentedString(apiInfo)).append("\n");
    sb.append("    deploymentInfo: ").append(toIndentedString(deploymentInfo)).append("\n");
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

