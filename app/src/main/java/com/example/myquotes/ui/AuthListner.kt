package com.example.myquotes.ui

interface AuthListner{
    fun onStarted()
    fun onSuccess()
    fun onFail(message:String)
}