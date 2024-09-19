package com.application.dependencyinjection

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val emailService: EmailService,
) {

    fun registerUser() {
        emailService.sendEmail(
            "example1@gmail.com",
            "example2@gmail.com",
            "Your account has been created"
        )
        userRepository.saveUser("example1@gmail.com", "123456")

    }
}