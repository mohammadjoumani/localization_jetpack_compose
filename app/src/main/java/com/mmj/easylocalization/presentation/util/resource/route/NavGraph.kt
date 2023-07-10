package com.mmj.easylocalization.presentation.util.resource.route

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mmj.easylocalization.presentation.home.HomeScreen
import com.mmj.easylocalization.presentation.main.MainViewModel

@Composable
fun NavGraph(mainViewModel: MainViewModel) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreen.KHomeScreen.route,
    ) {

        composable(route = AppScreen.KHomeScreen.route) {
            HomeScreen(mainViewModel = mainViewModel)
        }

        composable(route = AppScreen.KDetailsScreen.route) {
//            DetailsScreen(mainViewModel)
        }
    }
}