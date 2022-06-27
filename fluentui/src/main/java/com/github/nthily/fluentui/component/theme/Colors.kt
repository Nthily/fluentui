package com.github.nthily.fluentui.component.theme

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

// reference: https://github.com/microsoft/fluentui-android/blob/master/FluentUI/src/main/res/values/themes.xml
@Stable
interface IFluentUiColors {
    val colorPrimary @Composable get() = Color.Unspecified
    val colorPrimaryDark @Composable get() = Color.Unspecified
    val colorAccent @Composable get() = Color.Unspecified
    val textColorPrimary @Composable get() = Color.Unspecified

    // Theme Semantic Colors
    val colorPrimaryDarker @Composable get() = Color.Unspecified
    val colorPrimaryLight @Composable get() = Color.Unspecified
    val colorPrimaryLighter @Composable get() = Color.Unspecified

    val backgroundColor @Composable get() = Color.Unspecified
    val backgroundPressedColor @Composable get() = Color.Unspecified
    val backgroundPrimaryColor @Composable get() = Color.Unspecified
    val backgroundSecondaryColor @Composable get() = Color.Unspecified
    val backgroundSecondaryPressedColor @Composable get() = Color.Unspecified

    val foregroundColor @Composable get() = Color.Unspecified
    val foregroundSelectedColor @Composable get() = Color.Unspecified
    val foregroundSecondaryColor @Composable get() = Color.Unspecified
    val foregroundSecondaryIconColor @Composable get() = Color.Unspecified
    val foregroundOnPrimaryColor @Composable get() = Color.Unspecified
    val foregroundOnSecondaryColor @Composable get() = Color.Unspecified
    val dividerColor @Composable get() = Color.Unspecified

    // BottomNavigation
    val bottomNavigationBackgroundColor @Composable get() = Color.Unspecified
    val bottomNavigationForegroundActiveColor @Composable get() = Color.Unspecified
    val bottomNavigationForegroundInactiveColor @Composable get() = Color.Unspecified

    // Button
    val buttonBackgroundDefaultColor @Composable get() = Color.Unspecified
    val buttonBackgroundDisabledColor @Composable get() = Color.Unspecified
    val buttonBackgroundPressedColor @Composable get() = Color.Black
    val buttonTextDefaultColor @Composable get() = Color.Unspecified
    val buttonTextDisabledColor @Composable get() = Color.Unspecified

    // Button borderless
    val buttonBorderlessBackgroundDefaultColor @Composable get() = Color.Unspecified
    val buttonBorderlessBackgroundDisabledColor @Composable get() = Color.Unspecified
    val buttonBorderlessBackgroundPressedColor @Composable get() = Color.Black
    val buttonBorderlessTextDefaultColor @Composable get() = Color.Unspecified
    val buttonBorderlessTextDisabledColor @Composable get() = Color.Unspecified
    val buttonBorderlessTextPressedColor @Composable get() = Color.Unspecified

    // Button Outlined
    val buttonOutlinedTextDefaultColor @Composable get() = Color.Unspecified
    val buttonOutlinedTextPressedColor @Composable get() = Color.Unspecified
    val buttonOutlinedTextDisabledColor @Composable get() = Color.Unspecified
    val buttonOutlinedStrokeDefaultColor @Composable get() = Color.Unspecified
    val buttonOutlinedStrokePressedColor @Composable get() = Color.Unspecified
    val buttonOutlinedStrokeDisabledColor @Composable get() = Color.Unspecified

    // Progress
    val progressPrimaryColor @Composable get() = Color.Unspecified
    val progressBackgroundColor @Composable get() = Color.Unspecified

    // Tooltip
    val tooltipBackgroundColor @Composable get() = Color.Unspecified
    val tooltipTextColor @Composable get() = Color.Unspecified
}

private object LightColors: IFluentUiColors {
    override val colorPrimary @Composable get() = Color(0xFF0078D4)
    override val colorPrimaryDark @Composable get() = Color(0xFF005A9E)
    override val colorAccent @Composable get() = Color(0xFF0078D4)
    override val textColorPrimary @Composable get() = Color(0xFF212121)
    override val colorPrimaryDarker @Composable get() = Color(0xFF004578)
    override val colorPrimaryLight @Composable get() = Color(0xFFC7E0F4)
    override val colorPrimaryLighter @Composable get() = Color(0xFFEFF6FC)
    override val backgroundColor @Composable get() = Color.White
    override val backgroundPressedColor @Composable get() = Color(0xFFE1E1E1)
    override val backgroundPrimaryColor @Composable get() = colorPrimary
    override val backgroundSecondaryColor @Composable get() = Color(0xFF212121)
    override val backgroundSecondaryPressedColor @Composable get() = Color(0xFF6E6E6E)
    override val foregroundColor @Composable get() = Color(0xFF212121)
    override val foregroundSelectedColor @Composable get() = colorPrimary
    override val foregroundSecondaryColor @Composable get() = Color(0xFF6E6E6E)
    override val foregroundSecondaryIconColor @Composable get() = Color(0xFF919191)
    override val foregroundOnPrimaryColor @Composable get() = Color.White
    override val foregroundOnSecondaryColor @Composable get() = Color.White
    override val dividerColor @Composable get() = Color(0xFFE1E1E1)

    override val bottomNavigationBackgroundColor @Composable get() = backgroundColor
    override val bottomNavigationForegroundActiveColor @Composable get() = colorPrimary
    override val bottomNavigationForegroundInactiveColor @Composable get() = foregroundSecondaryColor

    override val buttonBackgroundDefaultColor @Composable get() = backgroundPrimaryColor
    override val buttonBackgroundDisabledColor @Composable get() = Color(0xFFF1F1F1)

    override val buttonTextDefaultColor @Composable get() = foregroundOnPrimaryColor
    override val buttonTextDisabledColor @Composable get() = Color(0xFFACACAC)

    override val buttonBorderlessBackgroundDefaultColor @Composable get() = Color.Transparent
    override val buttonBorderlessBackgroundDisabledColor @Composable get() = Color.Transparent
    override val buttonBorderlessTextDefaultColor @Composable get() = colorPrimary
    override val buttonBorderlessTextDisabledColor @Composable get() = Color(0xFFACACAC)
    override val buttonBorderlessTextPressedColor @Composable get() = colorPrimary

    override val buttonOutlinedTextDefaultColor @Composable get() = colorPrimary
    override val buttonOutlinedTextPressedColor @Composable get() = Color(0xFFC7E0F4)
    override val buttonOutlinedTextDisabledColor @Composable get() = Color(0xFFACACAC)
    override val buttonOutlinedStrokeDefaultColor @Composable get() = Color(0xFFC7E0F4)
    override val buttonOutlinedStrokePressedColor @Composable get() = Color(0xFFDEECF9)
    override val buttonOutlinedStrokeDisabledColor @Composable get() = Color(0xFFF1F1F1)

    override val progressPrimaryColor @Composable get() = colorPrimary
    override val progressBackgroundColor @Composable get() = Color(0xFFE1E1E1)

    override val tooltipBackgroundColor @Composable get() = backgroundSecondaryColor
    override val tooltipTextColor @Composable get() = foregroundOnSecondaryColor
}

private object DarkColors: IFluentUiColors {
    override val colorPrimary @Composable get() = Color(0xFF0086F0)
    override val colorPrimaryDark @Composable get() = Color(0xFF004C87)
    override val colorAccent @Composable get() = Color(0xFF004C87)
    override val textColorPrimary @Composable get() = Color.White
    override val colorPrimaryDarker @Composable get() = Color(0xFF043862)
    override val colorPrimaryLight @Composable get() = Color(0xFF3AA0F3)
    override val colorPrimaryLighter @Composable get() = Color(0xFF092C47)
    override val backgroundColor @Composable get() = Color.Black
    override val backgroundPressedColor @Composable get() = Color(0xFF212121)
    override val backgroundPrimaryColor @Composable get() = colorPrimary
    override val backgroundSecondaryColor @Composable get() = Color(0xFF212121)
    override val backgroundSecondaryPressedColor @Composable get() = Color(0xFF6E6E6E)
    override val foregroundColor @Composable get() = Color.White
    override val foregroundSelectedColor @Composable get() = colorPrimary
    override val foregroundSecondaryColor @Composable get() = Color(0xFF6E6E6E)
    override val foregroundSecondaryIconColor @Composable get() = Color(0xFF919191)
    override val foregroundOnPrimaryColor @Composable get() = Color.Black
    override val foregroundOnSecondaryColor @Composable get()= Color.White
    override val dividerColor @Composable get() = Color(0xFF292929)

    override val bottomNavigationBackgroundColor @Composable get() = backgroundColor
    override val bottomNavigationForegroundActiveColor @Composable get() = colorPrimary
    override val bottomNavigationForegroundInactiveColor @Composable get() = foregroundSecondaryColor

    override val buttonBackgroundDefaultColor @Composable get() = backgroundPrimaryColor
    override val buttonBackgroundPressedColor @Composable get() = colorPrimaryDarker
    override val buttonBackgroundDisabledColor @Composable get() = Color(0xFF0086F0)

    override val buttonTextDefaultColor @Composable get() = foregroundOnPrimaryColor
    override val buttonTextDisabledColor @Composable get() = colorPrimaryDark

    override val buttonBorderlessBackgroundDefaultColor @Composable get() = Color.Transparent
    override val buttonBorderlessBackgroundDisabledColor @Composable get() = Color.Transparent
    override val buttonBorderlessBackgroundPressedColor @Composable get() = Color.Transparent
    override val buttonBorderlessTextDefaultColor @Composable get() = colorPrimary
    override val buttonBorderlessTextDisabledColor @Composable get() = Color(0xFF6E6E6E)
    override val buttonBorderlessTextPressedColor @Composable get() = colorPrimaryDark

    override val buttonOutlinedTextDefaultColor @Composable get() = Color(0xFF0086F0)
    override val buttonOutlinedTextPressedColor @Composable get() = Color(0xFF3AA0F3)
    override val buttonOutlinedTextDisabledColor @Composable get() = Color(0xFF404040)
    override val buttonOutlinedStrokeDefaultColor @Composable get() = Color(0xFF3AA0F3)
    override val buttonOutlinedStrokePressedColor @Composable get() = Color(0xFF092C47)
    override val buttonOutlinedStrokeDisabledColor @Composable get() = Color(0xFF292929)

    override val progressPrimaryColor @Composable get() = colorPrimary
    override val progressBackgroundColor @Composable get() = Color(0xFF212121)

    override val tooltipBackgroundColor @Composable get() = backgroundPrimaryColor
    override val tooltipTextColor @Composable get() = foregroundOnPrimaryColor
}

class FluentUiColors : IFluentUiColors {

    var isLight by mutableStateOf(true)
        private set

    private val _curColors by derivedStateOf {
        if (isLight) LightColors else DarkColors
    }

    fun toggleTheme() {
        isLight = !isLight
    }

    fun toggleToLightColor() { isLight = true }
    fun toggleToDarkColor() { isLight = false }

    override val colorPrimary @Composable get() = animatedValue(targetValue = _curColors.colorPrimary)
    override val colorPrimaryDark @Composable get() = animatedValue(targetValue = _curColors.colorPrimaryDark)
    override val colorAccent @Composable get() = animatedValue(targetValue = _curColors.colorAccent)
    override val textColorPrimary @Composable get() = animatedValue(targetValue = _curColors.textColorPrimary)
    override val colorPrimaryDarker @Composable get() = animatedValue(targetValue = _curColors.colorPrimaryDarker)
    override val colorPrimaryLight @Composable get() = animatedValue(targetValue = _curColors.colorPrimaryLight)
    override val colorPrimaryLighter @Composable get() = animatedValue(targetValue = _curColors.colorPrimaryLighter)
    override val backgroundColor @Composable get() = animatedValue(targetValue = _curColors.backgroundColor)
    override val backgroundPressedColor @Composable get() = animatedValue(targetValue = _curColors.backgroundPressedColor)
    override val backgroundPrimaryColor @Composable get() = animatedValue(targetValue = _curColors.backgroundPrimaryColor)
    override val backgroundSecondaryColor @Composable get() = animatedValue(targetValue = _curColors.backgroundSecondaryColor)
    override val backgroundSecondaryPressedColor @Composable get() = animatedValue(targetValue = _curColors.backgroundSecondaryPressedColor)
    override val foregroundColor @Composable get() = animatedValue(targetValue = _curColors.foregroundColor)
    override val foregroundSelectedColor @Composable get() = animatedValue(targetValue = _curColors.foregroundSelectedColor)
    override val foregroundSecondaryColor @Composable get() = animatedValue(targetValue = _curColors.foregroundSecondaryColor)
    override val foregroundSecondaryIconColor @Composable get() = animatedValue(targetValue = _curColors.foregroundSecondaryIconColor)
    override val foregroundOnPrimaryColor @Composable get() = animatedValue(targetValue = _curColors.foregroundOnPrimaryColor)
    override val foregroundOnSecondaryColor @Composable get() = animatedValue(targetValue = _curColors.foregroundOnSecondaryColor)
    override val dividerColor @Composable get() = animatedValue(targetValue = _curColors.dividerColor)

    override val bottomNavigationBackgroundColor @Composable get() = animatedValue(targetValue = _curColors.bottomNavigationBackgroundColor)
    override val bottomNavigationForegroundActiveColor @Composable get() = animatedValue(targetValue = _curColors.bottomNavigationForegroundActiveColor)
    override val bottomNavigationForegroundInactiveColor @Composable get() = animatedValue(targetValue = _curColors.bottomNavigationForegroundInactiveColor)

    override val buttonBackgroundDefaultColor @Composable get() = animatedValue(targetValue = _curColors.buttonBackgroundDefaultColor)
    override val buttonBackgroundPressedColor @Composable get() = animatedValue(targetValue = _curColors.buttonBackgroundPressedColor)
    override val buttonBackgroundDisabledColor @Composable get() = animatedValue(targetValue = _curColors.buttonBackgroundDisabledColor)

    override val buttonTextDefaultColor @Composable get() = animatedValue(targetValue = _curColors.buttonTextDefaultColor)
    override val buttonTextDisabledColor @Composable get() = animatedValue(targetValue = _curColors.buttonTextDisabledColor)

    override val buttonBorderlessBackgroundDefaultColor @Composable get() = animatedValue(targetValue = _curColors.buttonBorderlessBackgroundDefaultColor)
    override val buttonBorderlessBackgroundDisabledColor @Composable get() = animatedValue(targetValue = _curColors.buttonBorderlessBackgroundDisabledColor)
    override val buttonBorderlessBackgroundPressedColor @Composable get() = animatedValue(targetValue = _curColors.buttonBorderlessBackgroundPressedColor)
    override val buttonBorderlessTextDefaultColor @Composable get() = animatedValue(targetValue = _curColors.buttonBorderlessTextDefaultColor)
    override val buttonBorderlessTextDisabledColor @Composable get() = animatedValue(targetValue = _curColors.buttonBorderlessTextDisabledColor)
    override val buttonBorderlessTextPressedColor @Composable get() = animatedValue(targetValue = _curColors.buttonBorderlessTextPressedColor)

    override val buttonOutlinedTextDefaultColor @Composable get() = animatedValue(targetValue = _curColors.buttonOutlinedTextDefaultColor)
    override val buttonOutlinedTextPressedColor @Composable get() = animatedValue(targetValue = _curColors.buttonOutlinedTextPressedColor)
    override val buttonOutlinedTextDisabledColor @Composable get() = animatedValue(targetValue = _curColors.buttonOutlinedTextDisabledColor)
    override val buttonOutlinedStrokeDefaultColor @Composable get() = animatedValue(targetValue = _curColors.buttonOutlinedStrokeDefaultColor)
    override val buttonOutlinedStrokePressedColor @Composable get() = animatedValue(targetValue = _curColors.buttonOutlinedStrokePressedColor)
    override val buttonOutlinedStrokeDisabledColor @Composable get() = animatedValue(targetValue = _curColors.buttonOutlinedStrokeDisabledColor)

    override val progressPrimaryColor @Composable get() = animatedValue(targetValue = _curColors.progressPrimaryColor)
    override val progressBackgroundColor @Composable get() = animatedValue(targetValue = _curColors.progressBackgroundColor)

    override val tooltipBackgroundColor @Composable get() = animatedValue(targetValue = _curColors.tooltipBackgroundColor)
    override val tooltipTextColor @Composable get() = animatedValue(targetValue = _curColors.tooltipTextColor)

}

val LocalFluentUiColors = staticCompositionLocalOf {
    FluentUiColors()
}

@Composable
private fun animatedValue(targetValue: Color) = animateColorAsState(
    targetValue = targetValue,
    tween(500)
).value
