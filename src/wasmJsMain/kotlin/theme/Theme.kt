package theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = AppColors.AccentGold,
    onPrimary = AppColors.BackgroundPrimary,
    background = AppColors.BackgroundPrimary,
    surface = AppColors.BackgroundTertiary,
    onBackground = AppColors.TextPrimary,
    onSurface = AppColors.TextPrimary,
    secondary = AppColors.TextSecondary,
)

private val LightColorScheme = lightColorScheme(
    primary = AppColors.AccentGold,
    onPrimary = Color.Black,
    background = AppColors.LightBackgroundPrimary,
    surface = AppColors.LightBackgroundSecondary,
    onBackground = AppColors.LightTextPrimary,
    onSurface = AppColors.LightTextPrimary,
    secondary = AppColors.LightTextSecondary,
)

@Composable
fun PortfolioTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography(),
        content = content
    )
}

