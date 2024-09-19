package com.application.dependencyinjection

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface DepartmemtData {
    fun departmentData()
}

class RetrieveDepartmentData @Inject constructor() : DepartmemtData {
    override fun departmentData() {
        Log.d(TAG, "Department Data Retrieved")
    }
}


class SendDepartmentData @Inject constructor():DepartmemtData{
    override fun departmentData() {
        Log.d(TAG, "Department Data Sent")
    }

}