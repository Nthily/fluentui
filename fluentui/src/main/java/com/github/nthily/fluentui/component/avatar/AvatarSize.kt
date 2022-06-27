package com.github.nthily.fluentui.component.avatar

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

sealed class AvatarSize(val dp: Dp) {
    object XSmall: AvatarSize(20.dp)
    object Small: AvatarSize(24.dp)
    object Medium: AvatarSize(32.dp)
    object Large: AvatarSize(40.dp)
    object XLarge: AvatarSize(52.dp)
    object XXLarge: AvatarSize(64.dp)

    override fun toString(): String {
        return when(this) {
            XSmall -> "XSmall"
            Small -> "Small"
            Medium -> "Medium"
            Large -> "Large"
            XLarge -> "XLarge"
            XXLarge -> "XXLarge"
        }
    }
}
