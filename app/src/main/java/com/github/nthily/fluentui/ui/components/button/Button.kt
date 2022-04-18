package com.github.nthily.fluentui.ui.components.button

import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.ripple.LocalRippleTheme
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
import androidx.compose.ui.unit.dp
import com.github.nthily.fluentui.ui.components.theme.FluentUi

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Button(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    border: BorderStroke? = null,
    values: BaseButtonValues = FluentUiButtonDefault.buttonValues(),
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
            )
    ) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
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
//    Surface(
//        modifier = modifier,
//        shape = values.shape,
//        color = background,
//        contentColor = contentColor.copy(alpha = 1f),
//        border = border,
//        onClick = onClick,
//        enabled = enabled,
//        role = Role.Button,
//        interactionSource = interactionSource,
//        indication = rememberRipple(color = values.rippleColor)
//    ) {
//        ProvideTextStyle(FluentUi.typography.body2.copy(contentColor)) {
//            Row(
//                Modifier
//                    .defaultMinSize(
//                        minHeight = values.minHeight
//                    )
//                    .padding(values.paddingValues),
//                horizontalArrangement = Arrangement.Center,
//                verticalAlignment = Alignment.CenterVertically,
//                content = content
//            )
//        }
//    }
}
