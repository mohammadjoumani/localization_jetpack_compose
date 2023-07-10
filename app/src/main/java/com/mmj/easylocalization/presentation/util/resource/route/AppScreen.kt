package com.mmj.easylocalization.presentation.util.resource.route

sealed class AppScreen(val route: String) {
    object KHomeScreen : AppScreen(ConstantAppScreenName.HOME_SCREEN)
    object KDetailsScreen : AppScreen(ConstantAppScreenName.DETAILS_SCREEN)
}


object ConstantAppScreenName {
    const val HOME_SCREEN = "home_screen"
    const val DETAILS_SCREEN = "details_screen"
}