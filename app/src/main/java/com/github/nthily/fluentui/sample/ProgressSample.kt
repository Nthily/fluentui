package com.github.nthily.fluentui.sample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.github.nthily.fluentui.component.divider.Divider
import com.github.nthily.fluentui.component.progress.CircularProgress
import com.github.nthily.fluentui.component.progress.ProgressSize
import com.github.nthily.fluentui.component.theme.FluentUi
import com.github.nthily.fluentui.core.common.CenterRow
import com.github.nthily.fluentui.core.common.HeightSpacer
import com.github.nthily.fluentui.core.common.WidthSpacer

@Composable
fun ProgressDemo() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(FluentUi.colors.backgroundColor)
            .padding(16.dp),
    ) {
        Text(
            text = "Circular Progress",
            style = FluentUi.typography.headline
        )
        HeightSpacer(5.dp)
        Divider()
        HeightSpacer(5.dp)
        val progressBar = listOf(
            ProgressSize.Large,
            ProgressSize.Medium,
            ProgressSize.Small,
            ProgressSize.XSmall
        )
        progressBar.forEach {
            CenterRow {
                Column {
                    Text("$it\n${it.dp}")
                }
                WidthSpacer(value = 20.dp)
                CircularProgress(size = it.dp, color = Color.Gray)
                WidthSpacer(value = 15.dp)
                CircularProgress(size = it.dp)
            }
            HeightSpacer(value = 16.dp)
        }
    }
}
