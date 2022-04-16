package com.github.nthily.fluentui.ui.components.avatar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

sealed class AvatarStyle(val shape: Shape) {
    object Circle: AvatarStyle(CircleShape)
    object Square: AvatarStyle(RoundedCornerShape(4.dp))
}
