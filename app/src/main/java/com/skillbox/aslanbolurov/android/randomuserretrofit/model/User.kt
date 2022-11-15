package com.skillbox.aslanbolurov.android.randomuserretrofit.model

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class User(
    @Json(name = "gender") var gender: String? = null,
    @Json(name = "name") var name: Name? = null,
    @Json(name = "location") var location: Location? = null,
    @Json(name = "city") var city: String? = null,
    @Json(name = "state") var state: String? = null,
    @Json(name = "country") var country: String? = null,
    @Json(name = "postcode") var postcode: Int? = null,
    @Json(name = "coordinates") var coordinates: Coordinates? = null,
    @Json(name = "timezone") var timezone: Timezone? = null,
    @Json(name = "email") var email: String? = null,
    @Json(name = "login") var login: Login? = null,
    @Json(name = "dob") var dob: Dob? = null,
    @Json(name = "registered") var registered: Registered? = null,
    @Json(name = "phone") var phone: String? = null,
    @Json(name = "cell") var cell: String? = null,
    @Json(name = "id") var id: Id? = null,
    @Json(name = "picture") var picture: Picture? = null,
    @Json(name = "nat") var nat: String? = null,
){
}