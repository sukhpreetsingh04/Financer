package com.sukhpreet.financer.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val FinancerColorScheme = lightColorScheme(
    primary = AtmBlue,
    onPrimary = SurfaceLight,
    primaryContainer = AtmBlueTint,
    onPrimaryContainer = AtmBlueDeep,

    secondary = DarkGreen,
    onSecondary = SurfaceLight,
    secondaryContainer = CyberEmerald,
    onSecondaryContainer = DarkGreen,

    background = Background,
    onBackground = TextBlack,

    surface = SurfaceLight,
    onSurface = TextBlack,
    surfaceVariant = AtmBlueTint,
    onSurfaceVariant = TextMuted,

    outline = BorderLight,
    error = ExpenseRed,
    onError = SurfaceLight
)

@Composable
fun FinancerTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = FinancerColorScheme,
        typography = Typography,
        content = content
    )
}
