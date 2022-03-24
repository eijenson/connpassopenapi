# CatApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBoard**](CatApi.md#getBoard) | **POST** /cats | 猫一覧取得


<a name="getBoard"></a>
# **getBoard**
> Status getBoard(body)

猫一覧取得

猫の情報を一覧で取得します

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : Status = apiInstance.getBoard(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatApi#getBoard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatApi#getBoard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.String**|  |

### Return type

[**Status**](Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

