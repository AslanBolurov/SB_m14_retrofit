package com.skillbox.aslanbolurov.android.randomuserretrofit

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.skillbox.aslanbolurov.android.randomuserretrofit.model.User
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


class RandomuserViewModel(
    private val repository:RandomuserRepository
) : ViewModel() {

    private var _state: MutableStateFlow<State> = MutableStateFlow<State>(State.Success)
    var state=_state.asStateFlow()

    private var _randomUser: MutableStateFlow<User?> =MutableStateFlow<User?>(User())
    var randomUser=_randomUser.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value=State.Loading
            try {
                val user= repository.getRandomUser()
                _randomUser.value=user
//                Log.d("aslan555", "btnRestartOnClick: ${user.dob?.age}")
            }
            catch (t:Throwable){
                _randomUser.value=User()
//                Log.d("aslan555", "btnRestartOnClick: error")
            }

            _state.value=State.Success
        }
    }

    fun btnRestartOnClick() {
        viewModelScope.launch {
            _state.value=State.Loading
            try {
                val user= repository.getRandomUser()
                _randomUser.value=user
//                Log.d("aslan555", "btnRestartOnClick: ${user.dob?.age}")
            }
            catch (t:Throwable){
                _randomUser.value=User()
//                Log.d("aslan555", "btnRestartOnClick: error")
            }

            _state.value=State.Success
        }
    }
}