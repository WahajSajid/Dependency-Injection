package com.application.dependencyinjection

import javax.inject.Inject

class University @Inject constructor(private val departmentData:DepartmemtData,private val faculityData: FaculityData) {
    fun universityData(){
        departmentData.departmentData()
        faculityData.faculityData()

    }
}