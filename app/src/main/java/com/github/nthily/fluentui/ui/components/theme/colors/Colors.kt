package com.github.nthily.fluentui.ui.components.theme.colors

import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color


// Reference Source: https://github.com/microsoft/fluentui-android/blob/master/FluentUI/src/main/res/values/themes.xml

class Colors(
    colorPrimary: Color,
    colorPrimaryDark: Color,
    colorAccent: Color,
    textColorPrimary: Color,

    backgroundColor: Color,
    backgroundPressedColor: Color,
    backgroundPrimaryColor: Color,
    backgroundSecondaryColor: Color,
    backgroundSecondaryPressedColor: Color,

    foregroundColor: Color,
    foregroundSelectedColor: Color,
    foregroundSecondaryColor: Color,
    foregroundSecondaryIconColor: Color,
    foregroundOnPrimaryColor: Color,
    foregroundOnSecondaryColor: Color,
    diverColor: Color,

    // Button
    buttonBackgroundDefaultColor: Color,
    buttonBackgroundDisabledColor: Color,
    buttonBackgroundPressedColor: Color,
    buttonTextDefaultColor: Color,
    buttonTextDisabledColor: Color,

    // Button borderless
    buttonBorderlessBackgroundDefaultColor: Color,
    buttonBorderlessBackgroundDisabledColor: Color,
    buttonBorderlessBackgroundPressedColor: Color,
    buttonBorderlessTextDefaultColor: Color,
    buttonBorderlessTextDisabledColor: Color,

    // Button Outlined
    buttonOutlinedTextDefaultColor: Color,
    buttonOutlinedTextPressedColor: Color,
    buttonOutlinedTextDisabledColor: Color,
    buttonOutlinedStrokeDefaultColor: Color,
    buttonOutlinedStrokePressedColor: Color,
    buttonOutlinedStrokeDisabledColor: Color,

    isLight: Boolean
) {

    var colorPrimary by mutableStateOf(colorPrimary, structuralEqualityPolicy())
        internal set
    var colorPrimaryDark by mutableStateOf(colorPrimaryDark, structuralEqualityPolicy())
        internal set
    var colorAccent by mutableStateOf(colorAccent, structuralEqualityPolicy())
        internal set
    var textColorPrimary by mutableStateOf(textColorPrimary, structuralEqualityPolicy())
        internal set

    // background
    var backgroundColor by mutableStateOf(backgroundColor, structuralEqualityPolicy())
        internal set
    var backgroundPressedColor by mutableStateOf(backgroundPressedColor, structuralEqualityPolicy())
        internal set
    var backgroundPrimaryColor by mutableStateOf(backgroundPrimaryColor, structuralEqualityPolicy())
        internal set
    var backgroundSecondaryColor by mutableStateOf(backgroundSecondaryColor, structuralEqualityPolicy())
        internal set
    var backgroundSecondaryPressedColor by mutableStateOf(backgroundSecondaryPressedColor, structuralEqualityPolicy())
        internal set

    // foreground
    var foregroundColor by mutableStateOf(foregroundColor, structuralEqualityPolicy())
        internal set
    var foregroundSelectedColor by mutableStateOf(foregroundSelectedColor, structuralEqualityPolicy())
        internal set
    var foregroundSecondaryColor by mutableStateOf(foregroundSecondaryColor, structuralEqualityPolicy())
        internal set
    var foregroundSecondaryIconColor by mutableStateOf(foregroundSecondaryIconColor, structuralEqualityPolicy())
        internal set
    var foregroundOnPrimaryColor by mutableStateOf(foregroundOnPrimaryColor, structuralEqualityPolicy())
        internal set
    var foregroundOnSecondaryColor by mutableStateOf(foregroundOnSecondaryColor, structuralEqualityPolicy())
        internal set
    var diverColor by mutableStateOf(diverColor, structuralEqualityPolicy())
        internal set

    var buttonBackgroundDefaultColor by mutableStateOf(buttonBackgroundDefaultColor, structuralEqualityPolicy())
        internal set
    var buttonBackgroundDisabledColor by mutableStateOf(buttonBackgroundDisabledColor, structuralEqualityPolicy())
        internal set
    var buttonBackgroundPressedColor by mutableStateOf(buttonBackgroundPressedColor, structuralEqualityPolicy())
        internal set
    var buttonTextDefaultColor by mutableStateOf(buttonTextDefaultColor, structuralEqualityPolicy())
        internal set
    var buttonTextDisabledColor by mutableStateOf(buttonTextDisabledColor, structuralEqualityPolicy())
        internal set

    var buttonBorderlessTextDefaultColor by mutableStateOf(buttonBorderlessTextDefaultColor, structuralEqualityPolicy())
        internal set
    var buttonBorderlessTextDisabledColor by mutableStateOf(buttonBorderlessTextDisabledColor, structuralEqualityPolicy())
        internal set
    var buttonBorderlessBackgroundPressedColor by mutableStateOf(buttonBorderlessBackgroundPressedColor, structuralEqualityPolicy())
        internal set
    var buttonBorderlessBackgroundDisabledColor by mutableStateOf(buttonBorderlessBackgroundDisabledColor, structuralEqualityPolicy())
        internal set
    var buttonBorderlessBackgroundDefaultColor by mutableStateOf(buttonBorderlessBackgroundDefaultColor, structuralEqualityPolicy())
        internal set

    var buttonOutlinedTextDefaultColor by mutableStateOf(buttonOutlinedTextDefaultColor, structuralEqualityPolicy())
        internal set
    var buttonOutlinedTextPressedColor by mutableStateOf(buttonOutlinedTextPressedColor, structuralEqualityPolicy())
        internal set
    var buttonOutlinedTextDisabledColor by mutableStateOf(buttonOutlinedTextDisabledColor, structuralEqualityPolicy())
        internal set
    var buttonOutlinedStrokeDefaultColor by mutableStateOf(buttonOutlinedStrokeDefaultColor, structuralEqualityPolicy())
        internal set
    var buttonOutlinedStrokePressedColor by mutableStateOf(buttonOutlinedStrokePressedColor, structuralEqualityPolicy())
        internal set
    var buttonOutlinedStrokeDisabledColor by mutableStateOf(buttonOutlinedStrokeDisabledColor, structuralEqualityPolicy())
        internal set

    var isLight by mutableStateOf(isLight, structuralEqualityPolicy())
        internal set
}

@Composable
fun lightColors(
    colorPrimary: Color = Color(0xFF0078D4),
    colorPrimaryDark: Color = Color(0xFF005A9E),
    colorAccent: Color = Color(0xFF0078D4),
    textColorPrimary: Color = Color(0xFF212121),
    backgroundColor: Color = Color.White,
    backgroundPressedColor: Color = Color(0xFFE1E1E1),
    backgroundPrimaryColor: Color = colorPrimary,
    backgroundSecondaryColor: Color = Color(0xFF212121),
    backgroundSecondaryPressedColor: Color = Color(0xFF6E6E6E),
    foregroundColor: Color = Color(0xFF212121),
    foregroundSelectedColor: Color = colorPrimary,
    foregroundSecondaryColor: Color = Color(0xFF6E6E6E),
    foregroundSecondaryIconColor: Color = Color(0xFF919191),
    foregroundOnPrimaryColor: Color = Color.White,
    foregroundOnSecondaryColor: Color = Color.White,
    diverColor: Color = Color(0xFFE1E1E1),
    buttonBackgroundDefaultColor: Color = backgroundPrimaryColor,
    buttonBackgroundDisabledColor: Color = Color(0xFFF1F1F1),
    buttonBackgroundPressedColor: Color = LocalRippleTheme.current.defaultColor(),
    buttonTextDefaultColor: Color = foregroundOnPrimaryColor,
    buttonTextDisabledColor: Color = Color(0xFFACACAC),
    buttonBorderlessBackgroundDefaultColor: Color = Color.Transparent,
    buttonBorderlessBackgroundDisabledColor: Color = Color.Transparent,
    buttonBorderlessBackgroundPressedColor: Color = LocalRippleTheme.current.defaultColor(),
    buttonBorderlessTextDefaultColor: Color = colorPrimary,
    buttonBorderlessTextDisabledColor: Color = Color(0xFFACACAC),
    buttonOutlinedTextDefaultColor: Color = colorPrimary,
    buttonOutlinedTextPressedColor: Color = Color(0xFFC7E0F4),
    buttonOutlinedTextDisabledColor: Color = Color(0xFFACACAC),
    buttonOutlinedStrokeDefaultColor: Color = Color(0xFFC7E0F4),
    buttonOutlinedStrokePressedColor: Color = Color(0xFFDEECF9),
    buttonOutlinedStrokeDisabledColor: Color = Color(0xFFF1F1F1),
    isLight: Boolean = true
) : Colors = Colors(
    colorPrimary,
    colorPrimaryDark,
    colorAccent,
    textColorPrimary,
    backgroundColor,
    backgroundPressedColor,
    backgroundPrimaryColor,
    backgroundSecondaryColor,
    backgroundSecondaryPressedColor,
    foregroundColor,
    foregroundSelectedColor,
    foregroundSecondaryColor,
    foregroundSecondaryIconColor,
    foregroundOnPrimaryColor,
    foregroundOnSecondaryColor,
    diverColor,

    buttonBackgroundDefaultColor,
    buttonBackgroundDisabledColor,
    buttonBackgroundPressedColor,
    buttonTextDefaultColor,
    buttonTextDisabledColor,

    buttonBorderlessBackgroundDefaultColor,
    buttonBorderlessBackgroundDisabledColor,
    buttonBorderlessBackgroundPressedColor,
    buttonBorderlessTextDefaultColor,
    buttonBorderlessTextDisabledColor,

    buttonOutlinedTextDefaultColor,
    buttonOutlinedTextPressedColor,
    buttonOutlinedTextDisabledColor,
    buttonOutlinedStrokeDefaultColor,
    buttonOutlinedStrokePressedColor,
    buttonOutlinedStrokeDisabledColor,
    isLight
)

class FluentUiColors {
    val colors @Composable
        get() = lightColors()
}

val LocalFluentUiColors = staticCompositionLocalOf {
    FluentUiColors()
}
