package com.skillbox.aslanbolurov.android.randomuserretrofit.model

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
class Coordinates {
    @Json(name="latitude") var latitude:String?=null
    @Json(name="longitute") var longitute:String?=null
}
