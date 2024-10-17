package com.example.setupproject.network

import com.example.setupproject.etc.TokenStorage
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class RetrofitInterceptor @Inject constructor(private val tokenStorage: TokenStorage): Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        //rewrite the request to add bearer token
        val newRequest = chain.request().newBuilder()
            .header("Authorization", "Bearer ${tokenStorage.getToken()}")
            .build()

        return chain.proceed(newRequest)
    }
}