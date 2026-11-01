package com.sukhpreet.financer.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val FinancerColorScheme = lightColorScheme(

    // Primary Brand
    primary = FinancerGreen,
    onPrimary = SurfaceLight,
    primaryContainer = FinancerGreenLight,
    onPrimaryContainer = FinancerGreenDark,

    // Secondary Accent
    secondary = MintAccent,
    onSecondary = TextPrimary,
    secondaryContainer = MintLight,
    onSecondaryContainer = FinancerGreenDark,

    // Scaffold
    background = Background,
    onBackground = TextPrimary,

    surface = SurfaceLight,
    onSurface = TextPrimary,

    surfaceVariant = SurfaceVariant,
    onSurfaceVariant = TextSecondary,

    // Borders
    outline = BorderLight,

    // Status Colors
    error = ExpenseRed,
    onError = SurfaceLight,

    tertiary = IncomeGreen,
    onTertiary = SurfaceLight
)

@Composable
fun FinancerTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = FinancerColorScheme,
        typography = Typography,
        content = content
    )
}
