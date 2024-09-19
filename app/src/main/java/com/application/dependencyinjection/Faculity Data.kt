package com.application.dependencyinjection

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface FaculityData {
    fun faculityData()
}


class RetrieveFaculityData @Inject constructor() : FaculityData {
    override fun faculityData() {
        Log.d(TAG, "Faculity Data Retrieved")
    }
}

class SendFaculityData @Inject constructor() : FaculityData {
    override fun faculityData() {
        Log.d(TAG, "Faculity Data Sent")
    }
}



