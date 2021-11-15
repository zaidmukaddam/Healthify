package com.zaid.healthify.ui.splashScreen

sealed class SplashScreenEvents {
    object NavigateToOnBoarding : SplashScreenEvents()
    object NavigateToLoginScreen : SplashScreenEvents()
    object NavigateToUserDetailsScreen : SplashScreenEvents()
    object NavigateToHomeScreen : SplashScreenEvents()
}
