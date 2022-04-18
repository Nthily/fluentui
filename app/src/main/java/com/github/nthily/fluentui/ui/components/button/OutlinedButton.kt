package com.github.nthily.fluentui.ui.components.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Surface
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.github.nthily.fluentui.ui.components.theme.FluentUi

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun OutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    values: BaseButtonValues = FluentUiButtonDefault.outlinedButtonValues(),
    content: @Composable RowScope.() -> Unit
) {
    val pressed = interactionSource.collectIsPressedAsState().value

    val defaultBorderColor = FluentUi.colors.buttonOutlinedStrokeDefaultColor
    val pressedBorderColor = values.rippleColor
    val disabledBorderColor = FluentUi.colors.buttonOutlinedStrokeDisabledColor

    val border by remember(enabled, pressed) {
        when {
            pressed -> mutableStateOf(BorderStroke(1.dp, pressedBorderColor))
            enabled -> mutableStateOf(BorderStroke(1.dp, defaultBorderColor))
            else -> mutableStateOf(BorderStroke(1.dp, disabledBorderColor))
        }
    }

    val contentColor = if (pressed) FluentUi.colors.buttonOutlinedTextPressedColor
        else values.contentColor(enabled).value
    val background by values.backgroundColor(enabled)

    Surface(
        modifier = modifier,
        shape = values.shape,
        color = background,
        contentColor = contentColor.copy(alpha = 1f),
        border = border,
        onClick = onClick,
        enabled = enabled,
        role = Role.Button,
        interactionSource = interactionSource,
        indication = rememberRipple(color = values.rippleColor)
    ) {
        ProvideTextStyle(FluentUi.typography.body2.copy(contentColor)) {
            Row(
                Modifier
                    .defaultMinSize(
                        minHeight = values.minHeight
                    )
                    .padding(values.paddingValues),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                content = content
            )
        }
    }
}
