package com.application.dependencyinjection

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){
    fun sendEmail(to:String,from:String,body:String){
        Log.d(TAG,"Email sent")

    }
}