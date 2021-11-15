package com.zaid.healthify.ui.homeScreen

sealed class MainActivityScreenEvents {
    data class ShowToast(val message: String) : MainActivityScreenEvents()
    object ShowNoInternetDialog : MainActivityScreenEvents()
    object Empty : MainActivityScreenEvents()
}
