package com.application.dependencyinjection

import dagger.Component

@Component(modules = [Module::class, DepartmentDataModule::class, FaculityDataModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)
    fun inject1(mainActivity: MainActivity)


    fun printData():PrintUsersData
}