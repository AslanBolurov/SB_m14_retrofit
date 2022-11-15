package com.skillbox.aslanbolurov.android.randomuserretrofit.model

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
class Timezone {
    @Json(name="offset") var offset:String?=null
    @Json(name="description") var description:String?=null

}
