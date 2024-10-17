package com.example.setupproject.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.setupproject.network.repository.LoginRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val repository: LoginRepository
): ViewModel() {

    fun loggingIn() {
        viewModelScope.launch {
            repository.login(
                onSuccess = {},
                onError = {},
                onLoading = {}
            )
        }
    }
}