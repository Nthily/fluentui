package com.github.nthily.fluentui.ui.components.theme.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.github.nthily.fluentui.ui.components.theme.FluentUi

val LocalFluentUiTypography = staticCompositionLocalOf {
    FluentUiTypography()
}

// Reference Source: https://github.com/microsoft/fluentui-android/blob/master/fluentui_core/src/main/res/values/styles_font.xml

class FluentUiTypography {
    val headline @Composable
        get() = TextStyle(
            fontSize = 28.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Light,
            color = FluentUi.colors.textColorPrimary
        )
    val title1 @Composable
        get() = TextStyle(
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Medium,
            color = FluentUi.colors.textColorPrimary
        )
    val title2 @Composable
        get() = TextStyle(
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = FluentUi.colors.textColorPrimary
        )
    val heading @Composable
        get() = TextStyle(
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif,
            color = FluentUi.colors.textColorPrimary
        )
    val subheading1 @Composable
        get() = TextStyle(
            fontSize = 16.sp,
            fontFamily = FontFamily.SansSerif,
            color = FluentUi.colors.textColorPrimary
        )
    val subheading2 @Composable
        get() = TextStyle(
            fontSize = 16.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Medium,
            color = FluentUi.colors.textColorPrimary
        )
    val body1 @Composable
        get() = TextStyle(
            fontSize = 14.sp,
            fontFamily = FontFamily.SansSerif,
            color = FluentUi.colors.textColorPrimary
        )
    val body2 @Composable
        get() = TextStyle(
            fontSize = 14.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Medium,
            color = FluentUi.colors.textColorPrimary
        )
    val caption @Composable
        get() = TextStyle(
            fontSize = 12.sp,
            fontFamily = FontFamily.SansSerif,
            color = FluentUi.colors.textColorPrimary
        )
}
