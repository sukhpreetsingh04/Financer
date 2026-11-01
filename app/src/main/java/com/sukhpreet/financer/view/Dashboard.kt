package com.sukhpreet.financer.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sukhpreet.financer.view.components.FinanceBottomBar
import com.sukhpreet.financer.view.components.FinancerTopBar
import com.sukhpreet.financer.view.components.QuickActionsGrid
import com.sukhpreet.financer.view.components.TransparentCard

@Composable
fun Dashboard(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier,
        topBar = { FinancerTopBar() },
        bottomBar = { FinanceBottomBar() }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(color = MaterialTheme.colorScheme.background)
        ) {
            TransparentCard()
            QuickActionsGrid {  }
        }
    }
}
