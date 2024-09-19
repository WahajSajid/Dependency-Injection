package com.application.dependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
abstract class DepartmentDataModule {
    @Binds
    abstract fun provideDepartmentData(retrieveDepartmentData: RetrieveDepartmentData): DepartmemtData
}