package com.application.dependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
abstract class FaculityDataModule {
    @Binds
    abstract fun provideFaculityData(retrieveFaculityData: RetrieveFaculityData): FaculityData
}