package com.github.nthily.fluentui.component.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable

object FluentUi {

    val colors: IFluentUiColors
        @Composable
        get() = LocalFluentUiColors.current

    val typography: FluentUiTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalFluentUiTypography.current

}
