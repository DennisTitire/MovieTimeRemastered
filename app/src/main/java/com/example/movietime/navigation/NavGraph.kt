package com.example.movietime.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.movietime.util.Components.DETAILS_ARGUMENT_KEY

@Composable
fun SetupNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {

        }
        composable(route = Screen.Welcome.route) {

        }
        composable(route = Screen.SignUp.route) {

        }
        composable(route = Screen.SignIn.route) {

        }
        composable(route = Screen.Home.route) {

        }
        composable(route = Screen.Explore.route) {

        }
        composable(route = Screen.MyList.route) {

        }
        composable(route = Screen.Settings.route) {

        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument(DETAILS_ARGUMENT_KEY) {
                type = NavType.IntType
            })
        ) {

        }
    }
}