package com.github.nthily.fluentui.ui.components.avatar

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

sealed class AvatarSize(val dp: Dp) {
    object XSMALL: AvatarSize(20.dp)
    object SMALL: AvatarSize(24.dp)
    object MEDIUM: AvatarSize(32.dp)
    object LARGE: AvatarSize(40.dp)
    object XLARGE: AvatarSize(52.dp)
    object XXLARGE: AvatarSize(64.dp)

    override fun toString(): String {
        return when(this) {
            XSMALL -> "XSmall"
            SMALL -> "Small"
            MEDIUM -> "Medium"
            LARGE -> "Large"
            XLARGE -> "XLarge"
            XXLARGE -> "XXLarge"
        }
    }
}
