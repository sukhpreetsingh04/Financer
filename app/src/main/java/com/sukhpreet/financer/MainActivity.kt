package com.sukhpreet.financer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.Modifier
import com.sukhpreet.financer.ui.theme.FinancerTheme
import com.sukhpreet.financer.view.Dashboard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FinancerTheme {
                Dashboard(modifier = Modifier)
            }
        }
    }
}
