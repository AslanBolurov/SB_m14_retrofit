package com.skillbox.aslanbolurov.android.randomuserretrofit.model

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
class Id {

    @Json(name="name") var name:String?=null
    @Json(name="value") var value:String?=null
}
