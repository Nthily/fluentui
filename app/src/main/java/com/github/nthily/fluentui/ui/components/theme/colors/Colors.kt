package com.github.nthily.fluentui.ui.components.theme.colors

import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color


// Reference Source: https://github.com/microsoft/fluentui-android/blob/master/FluentUI/src/main/res/values/themes.xml

interface IFluentUiColors {
    val colorPrimary: Color
    val colorPrimaryDark: Color
    val colorAccent: Color
    val textColorPrimary: Color

    // Theme Semantic Colors
    val colorPrimaryDarker: Color
    val colorPrimaryLight: Color
    val colorPrimaryLighter: Color

    val backgroundColor: Color
    val backgroundPressedColor: Color
    val backgroundPrimaryColor: Color
    val backgroundSecondaryColor: Color
    val backgroundSecondaryPressedColor: Color

    val foregroundColor: Color
    val foregroundSelectedColor: Color
    val foregroundSecondaryColor: Color
    val foregroundSecondaryIconColor: Color
    val foregroundOnPrimaryColor: Color
    val foregroundOnSecondaryColor: Color
    val diverColor: Color

    // Button
    val buttonBackgroundDefaultColor: Color
    val buttonBackgroundDisabledColor: Color
    val buttonBackgroundPressedColor: Color get() = Color.Black.copy(alpha = 1f)
    val buttonTextDefaultColor: Color
    val buttonTextDisabledColor: Color

    // Button borderless
    val buttonBorderlessBackgroundDefaultColor: Color
    val buttonBorderlessBackgroundDisabledColor: Color
    val buttonBorderlessBackgroundPressedColor: Color get() = Color.Black.copy(alpha = 0.1f)
    val buttonBorderlessTextDefaultColor: Color
    val buttonBorderlessTextDisabledColor: Color
    val buttonBorderlessTextPressedColor: Color

    // Button Outlined
    val buttonOutlinedTextDefaultColor: Color
    val buttonOutlinedTextPressedColor: Color
    val buttonOutlinedTextDisabledColor: Color
    val buttonOutlinedStrokeDefaultColor: Color
    val buttonOutlinedStrokePressedColor: Color
    val buttonOutlinedStrokeDisabledColor: Color

    val isLight: Boolean
}

private object LightColors: IFluentUiColors {
    override val colorPrimary: Color = Color(0xFF0078D4)
    override val colorPrimaryDark: Color = Color(0xFF005A9E)
    override val colorAccent: Color = Color(0xFF0078D4)
    override val textColorPrimary: Color = Color(0xFF212121)
    override val colorPrimaryDarker: Color = Color(0xFF004578)
    override val colorPrimaryLight: Color = Color(0xFFC7E0F4)
    override val colorPrimaryLighter: Color = Color(0xFFEFF6FC)
    override val backgroundColor: Color = Color.White
    override val backgroundPressedColor: Color = Color(0xFFE1E1E1)
    override val backgroundPrimaryColor: Color = colorPrimary
    override val backgroundSecondaryColor: Color = Color(0xFF212121)
    override val backgroundSecondaryPressedColor: Color = Color(0xFF6E6E6E)
    override val foregroundColor: Color = Color(0xFF212121)
    override val foregroundSelectedColor: Color = colorPrimary
    override val foregroundSecondaryColor: Color = Color(0xFF6E6E6E)
    override val foregroundSecondaryIconColor: Color = Color(0xFF919191)
    override val foregroundOnPrimaryColor: Color = Color.White
    override val foregroundOnSecondaryColor: Color = Color.White
    override val diverColor: Color = Color(0xFFE1E1E1)

    override val buttonBackgroundDefaultColor: Color = backgroundPrimaryColor
    override val buttonBackgroundDisabledColor: Color = Color(0xFFF1F1F1)

    override val buttonTextDefaultColor: Color = foregroundOnPrimaryColor
    override val buttonTextDisabledColor: Color = Color(0xFFACACAC)

    override val buttonBorderlessBackgroundDefaultColor: Color = Color.Transparent
    override val buttonBorderlessBackgroundDisabledColor: Color = Color.Transparent
    override val buttonBorderlessTextDefaultColor: Color = colorPrimary
    override val buttonBorderlessTextDisabledColor: Color = Color(0xFFACACAC)
    override val buttonBorderlessTextPressedColor: Color = colorPrimary

    override val buttonOutlinedTextDefaultColor: Color = colorPrimary
    override val buttonOutlinedTextPressedColor: Color = Color(0xFFC7E0F4)
    override val buttonOutlinedTextDisabledColor: Color = Color(0xFFACACAC)
    override val buttonOutlinedStrokeDefaultColor: Color = Color(0xFFC7E0F4)
    override val buttonOutlinedStrokePressedColor: Color = Color(0xFFDEECF9)
    override val buttonOutlinedStrokeDisabledColor: Color = Color(0xFFF1F1F1)
    override val isLight: Boolean = true
}

private object DarkColors: IFluentUiColors {
    override val colorPrimary: Color = Color(0xFF0086F0)
    override val colorPrimaryDark: Color = Color(0xFF004C87)
    override val colorAccent: Color = Color(0xFF004C87)
    override val textColorPrimary: Color = Color.White
    override val colorPrimaryDarker: Color = Color(0xFF043862)
    override val colorPrimaryLight: Color = Color(0xFF3AA0F3)
    override val colorPrimaryLighter: Color = Color(0xFF092C47)
    override val backgroundColor: Color = Color.Black
    override val backgroundPressedColor: Color = Color(0xFF212121)
    override val backgroundPrimaryColor: Color = colorPrimary
    override val backgroundSecondaryColor: Color = Color(0xFF212121)
    override val backgroundSecondaryPressedColor: Color = Color(0xFF6E6E6E)
    override val foregroundColor: Color = Color.White
    override val foregroundSelectedColor: Color = colorPrimary
    override val foregroundSecondaryColor: Color = Color(0xFF6E6E6E)
    override val foregroundSecondaryIconColor: Color = Color(0xFF919191)
    override val foregroundOnPrimaryColor: Color = Color.Black
    override val foregroundOnSecondaryColor: Color = Color.White
    override val diverColor: Color = Color(0xFF292929)

    override val buttonBackgroundDefaultColor: Color = backgroundPrimaryColor
    override val buttonBackgroundPressedColor: Color get() = colorPrimaryDarker
    override val buttonBackgroundDisabledColor: Color = Color(0xFF0086F0)

    override val buttonTextDefaultColor: Color = foregroundOnPrimaryColor
    override val buttonTextDisabledColor: Color = colorPrimaryDark

    override val buttonBorderlessBackgroundDefaultColor: Color = Color.Transparent
    override val buttonBorderlessBackgroundDisabledColor: Color = Color.Transparent
    override val buttonBorderlessBackgroundPressedColor: Color get() = Color.Transparent
    override val buttonBorderlessTextDefaultColor: Color = colorPrimary
    override val buttonBorderlessTextDisabledColor: Color = Color(0xFF6E6E6E)
    override val buttonBorderlessTextPressedColor: Color = colorPrimaryDark

    override val buttonOutlinedTextDefaultColor: Color = Color(0xFF0086F0)
    override val buttonOutlinedTextPressedColor: Color = Color(0xFF3AA0F3)
    override val buttonOutlinedTextDisabledColor: Color = Color(0xFF404040)
    override val buttonOutlinedStrokeDefaultColor: Color = Color(0xFF3AA0F3)
    override val buttonOutlinedStrokePressedColor: Color = Color(0xFF092C47)
    override val buttonOutlinedStrokeDisabledColor: Color = Color(0xFF292929)
    override val isLight: Boolean = false
}

class FluentUiColors {
    var colors: IFluentUiColors = LightColors
    fun changeLightColors() {
        colors = LightColors
    }
    fun changeDarkColors() {
        colors = DarkColors
    }
}

val LocalFluentUiColors = staticCompositionLocalOf {
    FluentUiColors()
}
