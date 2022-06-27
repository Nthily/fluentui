package com.github.nthily.fluentui.component.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.LocalContentColor
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.github.nthily.fluentui.component.theme.FluentUi

@Composable
fun LargeButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    border: BorderStroke? = null,
    values: BaseButtonValues = ButtonDefault.largeButtonValues(),
    textStyle: TextStyle = FluentUi.typography.body2.copy(values.contentColor(enabled).value),
    content: @Composable RowScope.() -> Unit
) {
    val contentColor by values.contentColor(enabled)
    val background by values.backgroundColor(enabled)
    Box(
        modifier = modifier
            .clip(values.shape)
            .background(background)
            .border(border ?: BorderStroke(0.dp, Color.Transparent))
            .clickable(
                onClick = onClick,
                enabled = enabled,
                interactionSource = interactionSource,
                indication = rememberRipple(color = values.rippleColor),
                role = Role.Button
            ),
        contentAlignment = Alignment.Center
    ) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            ProvideTextStyle(textStyle) {
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
