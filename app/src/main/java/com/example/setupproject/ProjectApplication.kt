package com.example.setupproject

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ProjectApplication: Application() {

    companion object {
        val baseUrl = ""
    }
}