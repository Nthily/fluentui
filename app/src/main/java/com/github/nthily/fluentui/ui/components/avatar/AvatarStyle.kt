package com.github.nthily.fluentui.ui.components.avatar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

sealed class AvatarStyle(val shape: Shape) {
    object CIRCLE: AvatarStyle(CircleShape)
    object SQUARE: AvatarStyle(RoundedCornerShape(4.dp))
}
