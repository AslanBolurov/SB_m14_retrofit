package com.skillbox.aslanbolurov.android.randomuserretrofit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class RandomuserViewModelFactory: ViewModelProvider.Factory  {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RandomuserViewModel::class.java)){
            return RandomuserViewModel(RandomuserRepository()) as T
        }else
        throw IllegalArgumentException("Unknown class name")
    }
}