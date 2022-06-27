package com.github.nthily.fluentui.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.github.nthily.fluentui.component.theme.FluentUiColors
import com.github.nthily.fluentui.component.theme.FluentUiTypography
import com.github.nthily.fluentui.component.theme.LocalFluentUiColors
import com.github.nthily.fluentui.component.theme.LocalFluentUiTypography

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun FluentUiTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val fluentUiColors = FluentUiColors()
    if (darkTheme) fluentUiColors.toggleToDarkColor() else fluentUiColors.toggleToLightColor()
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
    CompositionLocalProvider(
        LocalFluentUiColors provides fluentUiColors,
        LocalFluentUiTypography provides FluentUiTypography()
    ) {
        ProvideTextStyle(LocalFluentUiTypography.current.heading) {
            MaterialTheme(
                colors = colors,
                typography = Typography,
                shapes = Shapes,
                content = content
            )
        }
    }
}