package com.example.setupproject.network.repository

import com.example.setupproject.etc.TokenStorage
import com.example.setupproject.network.ApiService
import com.example.setupproject.network.generic.ApiHandler
import com.example.setupproject.network.generic.Status
import javax.inject.Inject

class LoginRepository @Inject constructor(
    private val apiService: ApiService,
    private val tokenStorage: TokenStorage
) {

    suspend fun login(
        onSuccess: () -> Unit,
        onError: () -> Unit,
        onLoading: () -> Unit
    ) {
        ApiHandler.handle(apiService.login()) {
            when (it.status) {
                Status.SUCCESS -> {

                }
                Status.ERROR -> {

                }
                Status.LOADING -> {

                }
            }
        }
    }
}