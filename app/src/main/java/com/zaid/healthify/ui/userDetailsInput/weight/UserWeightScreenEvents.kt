package com.zaid.healthify.ui.userDetailsInput.weight

sealed class UserWeightScreenEvents {
    object NavigateToNextScreen : UserWeightScreenEvents()
    data class ShowToast(val message: String) : UserWeightScreenEvents()
    object ShowNoInternetDialog : UserWeightScreenEvents()
}
