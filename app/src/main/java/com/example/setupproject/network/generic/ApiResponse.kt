package com.example.setupproject.network.generic

data class ApiResponse <T> (val status: Status, val data: T?, val error: String?) {
    companion object{
        fun <T> success(data:T?): ApiResponse<T>{
            return ApiResponse(Status.SUCCESS, data, null)
        }

        fun <T> error(msg:String?, data:T?): ApiResponse<T>{
            return ApiResponse(Status.ERROR, data, msg)
        }

        fun <T> loading(data:T?): ApiResponse<T>{
            return ApiResponse(Status.LOADING, data, null)
        }

    }
}