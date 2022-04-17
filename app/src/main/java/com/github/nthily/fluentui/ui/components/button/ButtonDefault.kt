package com.github.nthily.fluentui.ui.components.button

import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.unit.dp
import com.github.nthily.fluentui.ui.components.fluentui.FluentUi

@Stable
interface ButtonColors {
    @Composable
    fun backgroundColor(enabled: Boolean): State<Color>
    @Composable
    fun contentColor(enabled: Boolean): State<Color>
}

class DefaultButtonColors(
    private val backgroundColor: Color,
    private val contentColor: Color,
    private val disabledBackgroundColor: Color,
    private val disabledContentColor: Color
) : ButtonColors {
    @Composable
    override fun backgroundColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) backgroundColor else disabledBackgroundColor)
    }

    @Composable
    override fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) contentColor else disabledContentColor)
    }
}

object ButtonDefault {

    val buttonMinHeight = 36.dp
    val largeButtonMinHeight = 48.dp

    @Composable
    fun buttonColors(
        backgroundColor: Color = FluentUi.colors.buttonBackgroundDefaultColor,
        contentColor: Color = FluentUi.colors.buttonTextDefaultColor,
        disabledBackgroundColor: Color = FluentUi.colors.buttonBackgroundDisabledColor,
        disabledContentColor: Color = FluentUi.colors.buttonTextDisabledColor
    ): ButtonColors = DefaultButtonColors(
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        disabledBackgroundColor = disabledBackgroundColor,
        disabledContentColor = disabledContentColor
    )

}