package com.skillbox.aslanbolurov.android.randomuserretrofit.model

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
class Login {
    @Json(name="uuid") var uuid:String?=null
    @Json(name="username") var username:String?=null
    @Json(name="password") var password:String?=null
    @Json(name="salt") var salt:String?=null
    @Json(name="md5") var md5:String?=null
    @Json(name="sha1") var sha1:String?=null
    @Json(name="sha256") var sha256:String?=null


}
