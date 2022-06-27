package com.github.nthily.fluentui.component.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.material.LocalContentColor
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.github.nthily.fluentui.component.theme.FluentUi

@Composable
fun OutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    values: BaseButtonValues = ButtonDefault.outlinedButtonValues(),
    textStyle: TextStyle = FluentUi.typography.body2.copy(values.contentColor(enabled).value),
    content: @Composable RowScope.() -> Unit
) {
    val pressed by interactionSource.collectIsPressedAsState()

    val defaultBorderColor = FluentUi.colors.buttonOutlinedStrokeDefaultColor
    val pressedBorderColor = values.rippleColor
    val disabledBorderColor = FluentUi.colors.buttonOutlinedStrokeDisabledColor

    val textPressedColor = FluentUi.colors.buttonOutlinedTextPressedColor
    val textDefaultColor by values.contentColor(enabled)

    val border by remember(enabled, pressed) {
        when {
            pressed -> mutableStateOf(BorderStroke(1.dp, pressedBorderColor))
            enabled -> mutableStateOf(BorderStroke(1.dp, defaultBorderColor))
            else -> mutableStateOf(BorderStroke(1.dp, disabledBorderColor))
        }
    }

    val contentColor by derivedStateOf {
        if (pressed) textPressedColor else textDefaultColor
    }
    val background by values.backgroundColor(enabled)

    Box(
        modifier = modifier
            .clip(values.shape)
            .background(background)
            .border(border)
            .clickable(
                onClick = onClick,
                enabled = enabled,
                interactionSource = interactionSource,
                indication = rememberRipple(color = values.rippleColor)
            ),
        contentAlignment = Alignment.Center
    ) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            ProvideTextStyle(textStyle.copy(contentColor)) {
                Row(
                    Modifier
                        .defaultMinSize(
                            minHeight = values.minHeight
                        )
                        .padding(values.paddingValues),
                    content = content,
                    verticalAlignment = Alignment.CenterVertically
                )
            }
        }
    }
}
