package com.zaid.healthify.ui.userDetailsInput.userName

data class GetUserNameScreenState(
    val username: String = "",
    val isNextButtonEnabled: Boolean = false,
    val isLoading: Boolean = false
)
