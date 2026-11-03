package com.sukhpreet.financer.view.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sukhpreet.financer.navigation.Screen

@Composable
fun FinanceBottomBar(
    currentRoute: String?,
    onNavigate: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier,
        containerColor = MaterialTheme.colorScheme.background
    ) {

        NavigationBarItem(
            selected = currentRoute == Screen.Dashboard.route,
            onClick = {
                onNavigate(Screen.Dashboard.route)
            },
            icon = {
                Icon(
                    Icons.Default.Home,
                    contentDescription = "Home"
                )
            },
            label = { Text("Home") }
        )

        NavigationBarItem(
            selected = currentRoute == Screen.Transactions.route,
            onClick = {
                onNavigate(Screen.Transactions.route)
            },
            icon = {
                Icon(
                    Icons.AutoMirrored.Filled.List,
                    contentDescription = "Transactions"
                )
            },
            label = { Text("Transactions") }
        )

        NavigationBarItem(
            selected = currentRoute == Screen.Settings.route,
            onClick = {
                onNavigate(Screen.Settings.route)
            },
            icon = {
                Icon(
                    Icons.Default.Settings,
                    contentDescription = "Settings"
                )
            },
            label = { Text("Settings") }
        )
    }
}
