# AccountAPIApi

All URIs are relative to *https://virtserver.swaggerhub.com/Richard.Hudson/Restful-API-Design-Demo/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**closeAccount**](AccountAPIApi.md#closeAccount) | **DELETE** /accounts/{accountNumber} | Find account.
[**findAccount**](AccountAPIApi.md#findAccount) | **GET** /accounts/{accountNumber} | Find account.
[**findPayerAccount**](AccountAPIApi.md#findPayerAccount) | **GET** /payers/{payerId}/accounts/{accountNumber} | Find account.
[**findPayerAccounts**](AccountAPIApi.md#findPayerAccounts) | **GET** /payers/{payerId}/accounts | Find accounts.


<a name="closeAccount"></a>
# **closeAccount**
> closeAccount(accountNumber)

Find account.

Find account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountAPIApi()
val accountNumber : kotlin.String = accountNumber_example // kotlin.String | 
try {
    apiInstance.closeAccount(accountNumber)
} catch (e: ClientException) {
    println("4xx response calling AccountAPIApi#closeAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountAPIApi#closeAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountNumber** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findAccount"></a>
# **findAccount**
> AccountResource findAccount(accountNumber)

Find account.

Find account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountAPIApi()
val accountNumber : kotlin.String = accountNumber_example // kotlin.String | 
try {
    val result : AccountResource = apiInstance.findAccount(accountNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountAPIApi#findAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountAPIApi#findAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountNumber** | **kotlin.String**|  |

### Return type

[**AccountResource**](AccountResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

<a name="findPayerAccount"></a>
# **findPayerAccount**
> AccountResource findPayerAccount(payerId, accountNumber)

Find account.

Find payer account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountAPIApi()
val payerId : kotlin.String = payerId_example // kotlin.String | 
val accountNumber : kotlin.String = accountNumber_example // kotlin.String | 
try {
    val result : AccountResource = apiInstance.findPayerAccount(payerId, accountNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountAPIApi#findPayerAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountAPIApi#findPayerAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payerId** | **kotlin.String**|  |
 **accountNumber** | **kotlin.String**|  |

### Return type

[**AccountResource**](AccountResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

<a name="findPayerAccounts"></a>
# **findPayerAccounts**
> kotlin.Array&lt;AccountResource&gt; findPayerAccounts(payerId)

Find accounts.

Find payer accounts.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountAPIApi()
val payerId : kotlin.String = payerId_example // kotlin.String | 
try {
    val result : kotlin.Array<AccountResource> = apiInstance.findPayerAccounts(payerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountAPIApi#findPayerAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountAPIApi#findPayerAccounts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payerId** | **kotlin.String**|  |

### Return type

[**kotlin.Array&lt;AccountResource&gt;**](AccountResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

