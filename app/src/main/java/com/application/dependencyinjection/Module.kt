package com.application.dependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
abstract class Module {

    @Binds
    abstract fun extractData(extractFromAzure:ExtractDataFromAzure):ExtractData
}