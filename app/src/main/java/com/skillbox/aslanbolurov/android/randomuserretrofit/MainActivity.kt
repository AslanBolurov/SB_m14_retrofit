package com.skillbox.aslanbolurov.android.randomuserretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.skillbox.aslanbolurov.android.randomuserretrofit.model.Results
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import coil.load
import com.skillbox.aslanbolurov.android.randomuserretrofit.databinding.ActivityMainBinding
import kotlinx.coroutines.coroutineScope

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        supportFragmentManager.commit {
//            replace<RandomuserFragment>(R.id.fragment_container)
//        }



    }





}