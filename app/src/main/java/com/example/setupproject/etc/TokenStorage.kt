package com.example.setupproject.etc

import android.content.SharedPreferences
import javax.inject.Inject

class TokenStorage @Inject constructor(
    private val sharedPreferences: SharedPreferences
) {

    fun getToken(): String? {
        return sharedPreferences.getString("token", null)
    }

    fun setToken(string: String) {
        sharedPreferences.edit()
            .putString("token", string)
            .apply()
    }
}