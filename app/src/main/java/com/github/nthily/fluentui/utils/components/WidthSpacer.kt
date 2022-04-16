package com.github.nthily.fluentui.utils.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
internal fun WidthSpacer(
    value: Dp
) = Spacer(Modifier.padding(horizontal = value))