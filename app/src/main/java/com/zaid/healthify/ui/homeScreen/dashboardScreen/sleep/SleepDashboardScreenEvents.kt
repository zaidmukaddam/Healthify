package com.zaid.healthify.ui.homeScreen.dashboardScreen.sleep

sealed class SleepDashboardScreenEvents {
    data class ShowToast(val message: String) : SleepDashboardScreenEvents()
    object OpenAddSleepDialog : SleepDashboardScreenEvents()
    object ShowNoInternetDialog : SleepDashboardScreenEvents()
}
