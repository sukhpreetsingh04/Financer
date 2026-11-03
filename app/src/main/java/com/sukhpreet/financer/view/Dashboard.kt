package com.sukhpreet.financer.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sukhpreet.financer.view.components.QuickActionsGrid
import com.sukhpreet.financer.view.components.TransparentCard

@Composable
fun Dashboard(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(rememberScrollState())
    ) {

        TransparentCard()

        QuickActionsGrid(
            onExpenseClick = { },
            onIncomeClick = { },
            onBudgetClick = { },
            onReportsClick = { }
        )
    }
}
