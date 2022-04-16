package com.github.nthily.fluentui.ui.components.fluentui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.github.nthily.fluentui.utils.components.HeightSpacer

@Composable
fun FluentUiDemo() {
    val fluentUiTypography = FluentUi.typography
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Text("Headline is Light 28sp", style = fluentUiTypography.headline)
        HeightSpacer(value = 10.dp)
        Text("Title 1 is Medium 20sp", style = fluentUiTypography.title1)
        HeightSpacer(value = 10.dp)
        Text("Title 2 is Medium 20sp", style = fluentUiTypography.title2)
        HeightSpacer(value = 10.dp)
        Text("Heading is Regular 18sp", style = fluentUiTypography.heading)
        HeightSpacer(value = 10.dp)
        Text("Subheading 1 is Regular 16sp", style = fluentUiTypography.subheading1)
        HeightSpacer(value = 10.dp)
        Text("Subheading 2 is Medium 16sp", style = fluentUiTypography.subheading2)
        HeightSpacer(value = 10.dp)
        Text("Body 1 is Regular 14sp", style = fluentUiTypography.body1)
        HeightSpacer(value = 10.dp)
        Text("Body 2 is Medium 14 sp", style = fluentUiTypography.body2)
        HeightSpacer(value = 10.dp)
        Text("caption is Regular 12 sp", style = fluentUiTypography.caption)
    }
}
