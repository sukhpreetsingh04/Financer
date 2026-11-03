package com.sukhpreet.financer.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.sukhpreet.financer.view.Dashboard
import com.sukhpreet.financer.view.TransactionList
import com.sukhpreet.financer.view.UserProfile
import com.sukhpreet.financer.view.Settings
import com.sukhpreet.financer.view.components.FinancerTopBar
import com.sukhpreet.financer.view.components.FinanceBottomBar

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    val navBackStackEntry by
    navController.currentBackStackEntryAsState()

    val currentRoute = navBackStackEntry?.destination?.route

    fun navigateTo(route: String) {
        navController.navigate(route) {
            popUpTo(
                navController.graph.findStartDestination().id
            ) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }

    Scaffold(
        topBar = {
            FinancerTopBar(
                onProfileClick = {
                    navigateTo(Screen.Profile.route)
                }
            )
        },
        bottomBar = {
            FinanceBottomBar(
                currentRoute = currentRoute,
                onNavigate = { route ->
                    navigateTo(route)
                }
            )
        }
    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = Screen.Dashboard.route,
            modifier = Modifier.padding(innerPadding)
        ) {

            composable(Screen.Dashboard.route) {
                Dashboard()
            }

            composable(Screen.Transactions.route) {
                TransactionList()
            }

            composable(Screen.Profile.route) {
                UserProfile()
            }

            composable(Screen.Settings.route) {
                Settings()
            }
        }
    }
}