package com.github.nthily.fluentui.ui.components.progress

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.github.nthily.fluentui.ui.components.divider.Divider
import com.github.nthily.fluentui.ui.components.theme.FluentUi
import com.github.nthily.fluentui.utils.components.CenterRow
import com.github.nthily.fluentui.utils.components.HeightSpacer
import com.github.nthily.fluentui.utils.components.WidthSpacer

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
        Text(
            text = "Linear Progress",
            style = FluentUi.typography.headline
        )
        HeightSpacer(5.dp)
        Divider()
    }
}
