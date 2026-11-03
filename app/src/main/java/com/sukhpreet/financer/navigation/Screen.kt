package com.sukhpreet.financer.navigation

sealed class Screen(val route: String) {
    data object Dashboard : Screen("dashboard")
    data object Transactions : Screen("transactions")
    data object Profile : Screen("profile")
    data object Settings : Screen("settings")
}