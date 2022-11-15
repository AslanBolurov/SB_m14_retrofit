package com.skillbox.aslanbolurov.android.randomuserretrofit.model

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class Name(
    @Json(name="title") var title:String,
    @Json(name="first") var first:String,
    @Json(name="last") var last:String
) {
}