/**
 * 猫情報取得
 *
 * 猫の情報を取得するためのAPIを定義します 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 猫のID
 * @param name 猫の名前
 */

data class Cat (

    /* 猫のID */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* 猫の名前 */
    @Json(name = "name")
    val name: kotlin.String? = null

)

