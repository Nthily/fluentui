package com.github.nthily.fluentui.ui.components.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.github.nthily.fluentui.ui.components.theme.colors.IFluentUiColors
import com.github.nthily.fluentui.ui.components.theme.colors.LocalFluentUiColors
import com.github.nthily.fluentui.ui.components.theme.typography.FluentUiTypography
import com.github.nthily.fluentui.ui.components.theme.typography.LocalFluentUiTypography

object FluentUi {

    val colors: IFluentUiColors
        @Composable
        get() = LocalFluentUiColors.current.colors

    val typography: FluentUiTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalFluentUiTypography.current

}
