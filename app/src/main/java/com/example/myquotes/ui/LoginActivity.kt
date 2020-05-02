package com.example.myquotes.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.myquotes.R
import com.example.myquotes.databinding.ActivityLoginBinding
import com.example.myquotes.models.AuthViewModel

class LoginActivity : AppCompatActivity(),AuthListner {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewmodel = ViewModelProviders.of(this).get(AuthViewModel::class.java)
        binding.viewmodel = viewmodel
        viewmodel.authListner = this
    }

    override fun onStarted() {
        Toast.makeText(applicationContext,"Started",Toast.LENGTH_SHORT).show()
        Log.d("viewmodel","onStarted")
    }

    override fun onSuccess() {
        Toast.makeText(applicationContext,"Success",Toast.LENGTH_SHORT).show()
        Log.d("viewmodel","onSuccess")
    }

    override fun onFail(message: String) {
        Toast.makeText(applicationContext,"failed",Toast.LENGTH_SHORT).show()
        Log.d("viewmodel","onFail")
    }
}
