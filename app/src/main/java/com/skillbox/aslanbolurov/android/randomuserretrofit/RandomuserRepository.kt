package com.skillbox.aslanbolurov.android.randomuserretrofit

import android.util.Log
import com.skillbox.aslanbolurov.android.randomuserretrofit.model.Results
import com.skillbox.aslanbolurov.android.randomuserretrofit.model.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RandomuserRepository {

    suspend fun getRandomUser():User{
        return RetrofitInstance.searchRandomUserApi.getRandomUser().results.get(0)
    }

}