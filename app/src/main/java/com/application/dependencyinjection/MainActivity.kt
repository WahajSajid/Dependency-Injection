package com.application.dependencyinjection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.application.dependencyinjection.ui.theme.DependencyInjectionTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var userRegistration:UserRegistrationService
    @Inject
    lateinit var printData:PrintUsersData

    @Inject
   lateinit var university:University

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DependencyInjectionTheme {
                university()
            }
        }
    }

    private fun university(){
        val component = DaggerUserRegistrationComponent.create()
        component.inject1(this)
        university.universityData()
    }

    private fun user(){
        val component = DaggerUserRegistrationComponent.create()
        component.inject(this)
        component.printData().printUsersData()
        userRegistration.registerUser()
        printData.printUsersData()
    }
}
