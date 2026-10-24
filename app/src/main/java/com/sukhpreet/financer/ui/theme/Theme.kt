package com.sukhpreet.financer.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = NeonGreen,
    onPrimary = DarkBackground,
    primaryContainer = DarkGreen,
    onPrimaryContainer = NeonGreen,

    background = DarkBackground,
    onBackground = TextWhite,

    surface = SurfaceDark,
    onSurface = TextWhite,
    surfaceVariant = CyberEmerald,
    onSurfaceVariant = TextMuted
)

private val LightColorScheme = lightColorScheme(
    primary = DarkGreen,
    onPrimary = TextWhite,
    primaryContainer = NeonGreen.copy(alpha = 0.2f),
    onPrimaryContainer = DarkGreen,

    background = LightBackground,
    onBackground = TextBlack,

    surface = SurfaceLight,
    onSurface = TextBlack,
    surfaceVariant = Color(0xFFE2EBE7),
    onSurfaceVariant = Color(0xFF52635B)
)

@Composable
fun FinancerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}