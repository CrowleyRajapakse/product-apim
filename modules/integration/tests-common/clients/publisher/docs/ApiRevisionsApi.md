# ApiRevisionsApi

All URIs are relative to *https://apis.wso2.com/api/am/publisher/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAPIRevision**](ApiRevisionsApi.md#createAPIRevision) | **POST** /apis/{apiId}/revisions | Create a new API revision
[**deleteAPIRevision**](ApiRevisionsApi.md#deleteAPIRevision) | **DELETE** /apis/{apiId}/revisions/{revisionId} | Delete a revision of an API
[**deployAPIRevision**](ApiRevisionsApi.md#deployAPIRevision) | **POST** /apis/{apiId}/deploy-revision | Deploy a revision
[**getAPIRevision**](ApiRevisionsApi.md#getAPIRevision) | **GET** /apis/{apiId}/revisions/{revisionId} | Retrieve a revision of an API
[**getAPIRevisionDeployments**](ApiRevisionsApi.md#getAPIRevisionDeployments) | **GET** /apis/{apiId}/deploy-revision | List available deployed revision deployment details of an API
[**getAPIRevisions**](ApiRevisionsApi.md#getAPIRevisions) | **GET** /apis/{apiId}/revisions | List available revisions of an API
[**restoreAPIRevision**](ApiRevisionsApi.md#restoreAPIRevision) | **POST** /apis/{apiId}/restore-revision | Restore a revision
[**undeployAPIRevision**](ApiRevisionsApi.md#undeployAPIRevision) | **POST** /apis/{apiId}/undeploy-revision | Un-Deploy a revision


<a name="createAPIRevision"></a>
# **createAPIRevision**
> APIRevisionDTO createAPIRevision(apiId, body)

Create a new API revision

Create a new API revision 

### Example
```java
// Import classes:
//import org.wso2.am.integration.clients.publisher.api.ApiClient;
//import org.wso2.am.integration.clients.publisher.api.ApiException;
//import org.wso2.am.integration.clients.publisher.api.Configuration;
//import org.wso2.am.integration.clients.publisher.api.auth.*;
//import org.wso2.am.integration.clients.publisher.api.v1.ApiRevisionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2Security
OAuth OAuth2Security = (OAuth) defaultClient.getAuthentication("OAuth2Security");
OAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

ApiRevisionsApi apiInstance = new ApiRevisionsApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. 
APIRevisionDTO body = new APIRevisionDTO(); // APIRevisionDTO | API Revision object that needs to be added
try {
    APIRevisionDTO result = apiInstance.createAPIRevision(apiId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiRevisionsApi#createAPIRevision");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API.  |
 **body** | [**APIRevisionDTO**](APIRevisionDTO.md)| API Revision object that needs to be added | [optional]

### Return type

[**APIRevisionDTO**](APIRevisionDTO.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAPIRevision"></a>
# **deleteAPIRevision**
> APIRevisionListDTO deleteAPIRevision(apiId, revisionId)

Delete a revision of an API

Delete a revision of an API 

### Example
```java
// Import classes:
//import org.wso2.am.integration.clients.publisher.api.ApiClient;
//import org.wso2.am.integration.clients.publisher.api.ApiException;
//import org.wso2.am.integration.clients.publisher.api.Configuration;
//import org.wso2.am.integration.clients.publisher.api.auth.*;
//import org.wso2.am.integration.clients.publisher.api.v1.ApiRevisionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2Security
OAuth OAuth2Security = (OAuth) defaultClient.getAuthentication("OAuth2Security");
OAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

ApiRevisionsApi apiInstance = new ApiRevisionsApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. 
String revisionId = "revisionId_example"; // String | Revision ID of an API 
try {
    APIRevisionListDTO result = apiInstance.deleteAPIRevision(apiId, revisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiRevisionsApi#deleteAPIRevision");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API.  |
 **revisionId** | **String**| Revision ID of an API  |

### Return type

[**APIRevisionListDTO**](APIRevisionListDTO.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deployAPIRevision"></a>
# **deployAPIRevision**
> List&lt;APIRevisionDeploymentDTO&gt; deployAPIRevision(apiId, revisionId, body)

Deploy a revision

Deploy a revision 

### Example
```java
// Import classes:
//import org.wso2.am.integration.clients.publisher.api.ApiClient;
//import org.wso2.am.integration.clients.publisher.api.ApiException;
//import org.wso2.am.integration.clients.publisher.api.Configuration;
//import org.wso2.am.integration.clients.publisher.api.auth.*;
//import org.wso2.am.integration.clients.publisher.api.v1.ApiRevisionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2Security
OAuth OAuth2Security = (OAuth) defaultClient.getAuthentication("OAuth2Security");
OAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

ApiRevisionsApi apiInstance = new ApiRevisionsApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. 
String revisionId = "revisionId_example"; // String | Revision ID of an API 
List<APIRevisionDeploymentDTO> body = Arrays.asList(new APIRevisionDeploymentDTO()); // List<APIRevisionDeploymentDTO> | Deployment object that needs to be added
try {
    List<APIRevisionDeploymentDTO> result = apiInstance.deployAPIRevision(apiId, revisionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiRevisionsApi#deployAPIRevision");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API.  |
 **revisionId** | **String**| Revision ID of an API  |
 **body** | [**List&lt;APIRevisionDeploymentDTO&gt;**](APIRevisionDeploymentDTO.md)| Deployment object that needs to be added |

### Return type

[**List&lt;APIRevisionDeploymentDTO&gt;**](APIRevisionDeploymentDTO.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAPIRevision"></a>
# **getAPIRevision**
> APIRevisionDTO getAPIRevision(apiId, revisionId)

Retrieve a revision of an API

Retrieve a revision of an API 

### Example
```java
// Import classes:
//import org.wso2.am.integration.clients.publisher.api.ApiClient;
//import org.wso2.am.integration.clients.publisher.api.ApiException;
//import org.wso2.am.integration.clients.publisher.api.Configuration;
//import org.wso2.am.integration.clients.publisher.api.auth.*;
//import org.wso2.am.integration.clients.publisher.api.v1.ApiRevisionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2Security
OAuth OAuth2Security = (OAuth) defaultClient.getAuthentication("OAuth2Security");
OAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

ApiRevisionsApi apiInstance = new ApiRevisionsApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. 
String revisionId = "revisionId_example"; // String | Revision ID of an API 
try {
    APIRevisionDTO result = apiInstance.getAPIRevision(apiId, revisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiRevisionsApi#getAPIRevision");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API.  |
 **revisionId** | **String**| Revision ID of an API  |

### Return type

[**APIRevisionDTO**](APIRevisionDTO.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAPIRevisionDeployments"></a>
# **getAPIRevisionDeployments**
> APIRevisionDeploymentListDTO getAPIRevisionDeployments(apiId)

List available deployed revision deployment details of an API

List available deployed revision deployment details of an API 

### Example
```java
// Import classes:
//import org.wso2.am.integration.clients.publisher.api.ApiClient;
//import org.wso2.am.integration.clients.publisher.api.ApiException;
//import org.wso2.am.integration.clients.publisher.api.Configuration;
//import org.wso2.am.integration.clients.publisher.api.auth.*;
//import org.wso2.am.integration.clients.publisher.api.v1.ApiRevisionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2Security
OAuth OAuth2Security = (OAuth) defaultClient.getAuthentication("OAuth2Security");
OAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

ApiRevisionsApi apiInstance = new ApiRevisionsApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. 
try {
    APIRevisionDeploymentListDTO result = apiInstance.getAPIRevisionDeployments(apiId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiRevisionsApi#getAPIRevisionDeployments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API.  |

### Return type

[**APIRevisionDeploymentListDTO**](APIRevisionDeploymentListDTO.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAPIRevisions"></a>
# **getAPIRevisions**
> APIRevisionListDTO getAPIRevisions(apiId, query)

List available revisions of an API

List available revisions of an API 

### Example
```java
// Import classes:
//import org.wso2.am.integration.clients.publisher.api.ApiClient;
//import org.wso2.am.integration.clients.publisher.api.ApiException;
//import org.wso2.am.integration.clients.publisher.api.Configuration;
//import org.wso2.am.integration.clients.publisher.api.auth.*;
//import org.wso2.am.integration.clients.publisher.api.v1.ApiRevisionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2Security
OAuth OAuth2Security = (OAuth) defaultClient.getAuthentication("OAuth2Security");
OAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

ApiRevisionsApi apiInstance = new ApiRevisionsApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. 
Object query = null; // Object | 
try {
    APIRevisionListDTO result = apiInstance.getAPIRevisions(apiId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiRevisionsApi#getAPIRevisions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API.  |
 **query** | [**Object**](.md)|  | [optional]

### Return type

[**APIRevisionListDTO**](APIRevisionListDTO.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="restoreAPIRevision"></a>
# **restoreAPIRevision**
> APIDTO restoreAPIRevision(apiId, revisionId)

Restore a revision

Restore a revision to the working copy of the API 

### Example
```java
// Import classes:
//import org.wso2.am.integration.clients.publisher.api.ApiClient;
//import org.wso2.am.integration.clients.publisher.api.ApiException;
//import org.wso2.am.integration.clients.publisher.api.Configuration;
//import org.wso2.am.integration.clients.publisher.api.auth.*;
//import org.wso2.am.integration.clients.publisher.api.v1.ApiRevisionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2Security
OAuth OAuth2Security = (OAuth) defaultClient.getAuthentication("OAuth2Security");
OAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

ApiRevisionsApi apiInstance = new ApiRevisionsApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. 
String revisionId = "revisionId_example"; // String | Revision ID of an API 
try {
    APIDTO result = apiInstance.restoreAPIRevision(apiId, revisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiRevisionsApi#restoreAPIRevision");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API.  |
 **revisionId** | **String**| Revision ID of an API  |

### Return type

[**APIDTO**](APIDTO.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="undeployAPIRevision"></a>
# **undeployAPIRevision**
> List&lt;APIRevisionDeploymentDTO&gt; undeployAPIRevision(apiId, revisionId, body)

Un-Deploy a revision

Un-Deploy a revision 

### Example
```java
// Import classes:
//import org.wso2.am.integration.clients.publisher.api.ApiClient;
//import org.wso2.am.integration.clients.publisher.api.ApiException;
//import org.wso2.am.integration.clients.publisher.api.Configuration;
//import org.wso2.am.integration.clients.publisher.api.auth.*;
//import org.wso2.am.integration.clients.publisher.api.v1.ApiRevisionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2Security
OAuth OAuth2Security = (OAuth) defaultClient.getAuthentication("OAuth2Security");
OAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

ApiRevisionsApi apiInstance = new ApiRevisionsApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. 
String revisionId = "revisionId_example"; // String | Revision ID of an API 
List<APIRevisionDeploymentDTO> body = Arrays.asList(new APIRevisionDeploymentDTO()); // List<APIRevisionDeploymentDTO> | Deployment object that needs to be added
try {
    List<APIRevisionDeploymentDTO> result = apiInstance.undeployAPIRevision(apiId, revisionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiRevisionsApi#undeployAPIRevision");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API.  |
 **revisionId** | **String**| Revision ID of an API  |
 **body** | [**List&lt;APIRevisionDeploymentDTO&gt;**](APIRevisionDeploymentDTO.md)| Deployment object that needs to be added |

### Return type

[**List&lt;APIRevisionDeploymentDTO&gt;**](APIRevisionDeploymentDTO.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

