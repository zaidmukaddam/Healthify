package com.zaid.healthify.ui.onBoarding

sealed class OnBoardingScreenEvents {
    object NavigateToLoginScreen : OnBoardingScreenEvents()
    class ShowNextPage(val pageNo: Int) : OnBoardingScreenEvents()
}
