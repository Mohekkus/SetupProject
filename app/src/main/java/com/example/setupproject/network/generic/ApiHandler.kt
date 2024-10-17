package com.example.setupproject.network.generic

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object ApiHandler {

    fun <T> handle(
        call: Call<T>,
        onResult: (ApiResponse<T>) -> Unit
    ) {
        call.enqueue(object : Callback<T> {
            override fun onResponse(p0: Call<T>, response: Response<T>) {
                onResult(
                    if (response.isSuccessful)
                        ApiResponse.success(response.body())
                    else
                        ApiResponse.error(
                            response.errorBody()?.string(), null
                        )
                )
            }

            override fun onFailure(p0: Call<T>, t: Throwable) {
                onResult(ApiResponse.error(t.message, null))
            }
        })
    }
}