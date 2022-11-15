package com.skillbox.aslanbolurov.android.randomuserretrofit.model

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
class Picture {

    @Json(name="large") var large:String?=null
    @Json(name="medium") var medium:String?=null
    @Json(name="thumbnail") var thumbnail:String?=null
}