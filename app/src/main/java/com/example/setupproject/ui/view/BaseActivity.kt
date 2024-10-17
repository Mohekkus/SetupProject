package com.example.setupproject.ui.view

import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.setupproject.ui.viewmodel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BaseActivity: AppCompatActivity() {

    private val viewmodel: LoginViewModel by viewModels()

}