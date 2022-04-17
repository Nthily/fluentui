package com.github.nthily.fluentui.ui.components.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Surface
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import com.github.nthily.fluentui.ui.components.theme.FluentUi

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BorderlessButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    border: BorderStroke? = null,
    values: BaseButtonInterface = FluentUiButtonDefault.borderlessButtonValues(),
    content: @Composable RowScope.() -> Unit
) {
    val contentColor by values.contentColor(enabled)
    val background = values.backgroundColor(enabled).value
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
