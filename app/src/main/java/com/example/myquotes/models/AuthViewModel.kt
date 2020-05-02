package com.example.myquotes.models

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.myquotes.ui.AuthListner

class AuthViewModel :ViewModel(){
    var number:String? = null
    var password:String? = null
    var authListner:AuthListner? = null

    fun onLoginButtonClicked(view : View){
        authListner?.onStarted()
        if(number.isNullOrEmpty() || password.isNullOrEmpty()){
            authListner?.onFail("number or password may be empty")
            return
        }
        authListner?.onSuccess()
    }
}