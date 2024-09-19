package com.application.dependencyinjection

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject


interface ExtractData{
    fun extractData()
}


class ExtractDataFromFirebase @Inject constructor():ExtractData {
    override fun extractData() {
        Log.d(TAG,"Data extracted from Firebase")
    }
}
class ExtractDataFromAzure @Inject constructor():ExtractData{
    override fun extractData() {
        Log.d(TAG, "Data extracted from Azure")
    }
}