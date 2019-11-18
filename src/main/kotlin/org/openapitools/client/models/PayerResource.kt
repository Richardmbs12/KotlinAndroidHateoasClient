/**
* Restful API Design Account Demo
* A demonstration on a Restful API contract.
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.squareup.moshi.Json

import de.otto.edison.hal.HalRepresentation

/**
 * 
 * @param payerId 
 * @param payerName 
 */

data class PayerResource (
    @Json(name = "payerId")
    val payerId: kotlin.String,
    @Json(name = "payerName")
    val payerName: kotlin.String
) : HalRepresentation() 



