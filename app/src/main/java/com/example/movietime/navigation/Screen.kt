package com.example.movietime.navigation

sealed class Screen(
    val route: String
) {
    object Splash : Screen(route = "splash_screen")
    object Welcome : Screen(route = "welcome_screen")
    object SignUp : Screen(route = "signUp_screen")
    object SignIn : Screen(route = "signIn_screen")
    object Home : Screen(route = "home_screen")
    object Explore : Screen(route = "explore_screen")
    object MyList : Screen(route = "myList_screen")
    object Detail : Screen(route = "detail_screen") {
        fun passItemId(itemId: Int): String {
            return "detail_screen{$itemId}"
        }
    }

    object Settings : Screen(route = "settings_screen")
}
