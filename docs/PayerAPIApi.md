# PayerAPIApi

All URIs are relative to *https://virtserver.swaggerhub.com/Richard.Hudson/Restful-API-Design-Demo/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPayer**](PayerAPIApi.md#createPayer) | **POST** /payers | Create new payer.
[**createReplacePayer**](PayerAPIApi.md#createReplacePayer) | **PUT** /payers/{payerId} | Create/Replace payer.
[**findPayer**](PayerAPIApi.md#findPayer) | **GET** /payers/{payerId} | Find payer by id.
[**findPayers**](PayerAPIApi.md#findPayers) | **GET** /payers | Find payers.
[**removePayer**](PayerAPIApi.md#removePayer) | **DELETE** /payers/{payerId} | Delete payer by id.
[**updatePayer**](PayerAPIApi.md#updatePayer) | **PATCH** /payers/{payerId} | Update payer.


<a name="createPayer"></a>
# **createPayer**
> PayerResource createPayer(payerResource)

Create new payer.

Create/Replace payer by id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayerAPIApi()
val payerResource : PayerResource =  // PayerResource | 
try {
    val result : PayerResource = apiInstance.createPayer(payerResource)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayerAPIApi#createPayer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayerAPIApi#createPayer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payerResource** | [**PayerResource**](PayerResource.md)|  | [optional]

### Return type

[**PayerResource**](PayerResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

<a name="createReplacePayer"></a>
# **createReplacePayer**
> PayerResource createReplacePayer(payerId)

Create/Replace payer.

Create/Replace payer by id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayerAPIApi()
val payerId : kotlin.String = payerId_example // kotlin.String | 
try {
    val result : PayerResource = apiInstance.createReplacePayer(payerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayerAPIApi#createReplacePayer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayerAPIApi#createReplacePayer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payerId** | **kotlin.String**|  |

### Return type

[**PayerResource**](PayerResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

<a name="findPayer"></a>
# **findPayer**
> PayerResource findPayer(payerId)

Find payer by id.

Find by id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayerAPIApi()
val payerId : kotlin.String = payerId_example // kotlin.String | 
try {
    val result : PayerResource = apiInstance.findPayer(payerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayerAPIApi#findPayer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayerAPIApi#findPayer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payerId** | **kotlin.String**|  |

### Return type

[**PayerResource**](PayerResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

<a name="findPayers"></a>
# **findPayers**
> kotlin.Array&lt;PayerResource&gt; findPayers()

Find payers.

Get list of payers.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayerAPIApi()
try {
    val result : kotlin.Array<PayerResource> = apiInstance.findPayers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayerAPIApi#findPayers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayerAPIApi#findPayers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;PayerResource&gt;**](PayerResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

<a name="removePayer"></a>
# **removePayer**
> removePayer(payerId)

Delete payer by id.

Delete by id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayerAPIApi()
val payerId : kotlin.String = payerId_example // kotlin.String | 
try {
    apiInstance.removePayer(payerId)
} catch (e: ClientException) {
    println("4xx response calling PayerAPIApi#removePayer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayerAPIApi#removePayer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payerId** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updatePayer"></a>
# **updatePayer**
> PayerResource updatePayer(payerId)

Update payer.

Update payer by id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayerAPIApi()
val payerId : kotlin.String = payerId_example // kotlin.String | 
try {
    val result : PayerResource = apiInstance.updatePayer(payerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayerAPIApi#updatePayer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayerAPIApi#updatePayer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payerId** | **kotlin.String**|  |

### Return type

[**PayerResource**](PayerResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

