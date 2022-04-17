package com.github.nthily.fluentui.ui.components.fluentui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.github.nthily.fluentui.ui.components.fluentui.colors.Colors
import com.github.nthily.fluentui.ui.components.fluentui.colors.FluentUiColors
import com.github.nthily.fluentui.ui.components.fluentui.colors.LocalFluentUiColors
import com.github.nthily.fluentui.ui.components.fluentui.colors.lightColors
import com.github.nthily.fluentui.ui.components.fluentui.typography.FluentUiTypography
import com.github.nthily.fluentui.ui.components.fluentui.typography.LocalFluentUiTypography

object FluentUi {

    val colors: Colors
        @Composable
        get() = LocalFluentUiColors.current.colors

    val typography: FluentUiTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalFluentUiTypography.current
}
