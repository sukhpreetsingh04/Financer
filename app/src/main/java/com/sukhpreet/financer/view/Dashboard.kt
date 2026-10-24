package com.sukhpreet.financer.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sukhpreet.financer.view.components.FinancerTopBar

@Composable
fun Dashboard(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier,
        topBar = { FinancerTopBar() }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(color = MaterialTheme.colorScheme.background)
        ) {
            Text(
                text = "Welcome to your Finance Dashboard screen details!",
                color = MaterialTheme.colorScheme.onBackground
            )
        }
    }
}
