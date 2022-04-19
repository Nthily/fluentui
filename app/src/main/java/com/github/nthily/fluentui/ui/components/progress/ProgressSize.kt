package com.github.nthily.fluentui.ui.components.progress

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

sealed class ProgressSize(val dp: Dp) {
    object Large: ProgressSize(44.dp)
    object Medium: ProgressSize(36.dp)
    object Small: ProgressSize(24.dp)
    object XSmall: ProgressSize(20.dp)

    override fun toString(): String {
        return when (this) {
            Large -> "Large"
            Medium -> "Medium"
            Small -> "Small"
            XSmall -> "XSmall"
        }
    }
}
