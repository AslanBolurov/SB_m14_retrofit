package com.skillbox.aslanbolurov.android.randomuserretrofit

import com.skillbox.aslanbolurov.android.randomuserretrofit.model.Results
import com.skillbox.aslanbolurov.android.randomuserretrofit.model.User
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers

private const val BASE_URL="https://randomuser.me"

object RetrofitInstance{
    private val retrofit= Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val searchRandomUserApi:SearchRandomUserApi= retrofit.create(SearchRandomUserApi::class.java)

}


interface SearchRandomUserApi{
    @Headers (
        "Accept: application/json",
        "Content-type: application/json"
    )

    @GET("api")
    suspend fun getRandomUser():Results
}