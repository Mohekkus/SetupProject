package com.example.setupproject.network

import retrofit2.Call
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {

    @Headers("Accept: application/json")
    @POST("")
    suspend fun login(): Call<Any>
}