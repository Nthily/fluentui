package com.github.nthily.fluentui.component.divider

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.github.nthily.fluentui.component.theme.FluentUi

@Composable
fun Divider(
    modifier: Modifier = Modifier,
    thickness: Dp = (0.5).dp,
    color: Color = FluentUi.colors.dividerColor,
    startIndent: Dp = 0.dp
) {
    androidx.compose.material.Divider(
        modifier = modifier,
        color = color,
        thickness = thickness,
        startIndent = startIndent
    )
}
