package com.github.nthily.fluentui.ui.components.avatar

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

sealed class AvatarSize(val dp: Dp) {
    object Xsmall: AvatarSize(20.dp)
    object Small: AvatarSize(24.dp)
    object Medium: AvatarSize(32.dp)
    object Large: AvatarSize(40.dp)
    object Xlarge: AvatarSize(52.dp)
    object XxLarge: AvatarSize(64.dp)

    override fun toString(): String {
        return when(this) {
            Xsmall -> "XSmall"
            Small -> "Small"
            Medium -> "Medium"
            Large -> "Large"
            Xlarge -> "XLarge"
            XxLarge -> "XXLarge"
        }
    }
}
