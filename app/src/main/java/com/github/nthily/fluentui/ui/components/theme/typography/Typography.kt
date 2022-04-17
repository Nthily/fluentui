package com.github.nthily.fluentui.ui.components.theme.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val LocalFluentUiTypography = staticCompositionLocalOf {
    FluentUiTypography()
}

// Reference Source: https://github.com/microsoft/fluentui-android/blob/master/fluentui_core/src/main/res/values/styles_font.xml

class FluentUiTypography {
    val headline @Composable
    get() = TextStyle(
            fontSize = 28.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Light
        )
    val title1 @Composable
    get() = TextStyle(
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Medium
        )
    val title2 @Composable
    get() = TextStyle(
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif
        )
    val heading @Composable
    get() = TextStyle(
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif
        )
    val subheading1 @Composable
    get() = TextStyle(
            fontSize = 16.sp,
            fontFamily = FontFamily.SansSerif
        )
    val subheading2 @Composable
    get() = TextStyle(
            fontSize = 16.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Medium
        )
    val body1 @Composable
    get() = TextStyle(
            fontSize = 14.sp,
            fontFamily = FontFamily.SansSerif
        )
    val body2 @Composable
    get() = TextStyle(
            fontSize = 14.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Medium
        )
    val caption @Composable
    get() = TextStyle(
            fontSize = 12.sp,
            fontFamily = FontFamily.SansSerif
        )
}
