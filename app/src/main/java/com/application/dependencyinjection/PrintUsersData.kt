package com.application.dependencyinjection

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log
import javax.inject.Inject

class PrintUsersData @Inject constructor(private val extractDataFromDatabase: ExtractData) {
    fun printUsersData(){
        extractDataFromDatabase.extractData()
        Log.d(TAG,"Users Data Printed")
    }
}