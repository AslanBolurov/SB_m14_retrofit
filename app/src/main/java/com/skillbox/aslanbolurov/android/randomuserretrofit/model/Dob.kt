package com.skillbox.aslanbolurov.android.randomuserretrofit.model

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
class Dob {
    @Json(name="date") var date:String?=null
    @Json(name="age") var age:Int?=null
}
