package com.skillbox.aslanbolurov.android.randomuserretrofit.model

import com.squareup.moshi.*


@JsonClass(generateAdapter = true)
data class Results(
    @Json(name = "results") val results: Array<User>
) {

}