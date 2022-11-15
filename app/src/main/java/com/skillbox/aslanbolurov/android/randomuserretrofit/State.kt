package com.skillbox.aslanbolurov.android.randomuserretrofit

sealed class State {
    object Loading:State()
    object Success:State()
}