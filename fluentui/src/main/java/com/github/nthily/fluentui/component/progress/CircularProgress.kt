package com.github.nthily.fluentui.component.progress

import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.Dp
import com.github.nthily.fluentui.R
import com.github.nthily.fluentui.component.theme.FluentUi

@Composable
fun CircularProgress(
    modifier: Modifier = Modifier,
    size: Dp = ProgressSize.Medium.dp,
    color: Color = FluentUi.colors.progressPrimaryColor,
) {
    val image = ImageVector.vectorResource(id = R.drawable.ms_ic_progress_circular_gray_large)
    val infiniteTransition = rememberInfiniteTransition()
    val rotateFloat by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(1000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        )
    )
    Icon(
        imageVector = image,
        contentDescription = null,
        modifier = modifier
            .size(size)
            .rotate(rotateFloat),
        tint = color
    )
}
