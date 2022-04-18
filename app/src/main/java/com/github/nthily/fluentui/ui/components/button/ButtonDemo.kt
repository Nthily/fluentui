package com.github.nthily.fluentui.ui.components.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.github.nthily.fluentui.ui.components.theme.FluentUi
import com.github.nthily.fluentui.utils.components.HeightSpacer

@Composable
fun ButtonDemo() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(FluentUi.colors.backgroundColor)
            .padding(16.dp)
    ) {
        Text(
            text = "Button",
            style = FluentUi.typography.headline,
            color = FluentUi.colors.textColorPrimary
        )
        HeightSpacer(value = 10.dp)
        Divider(thickness = 1.dp, color = FluentUi.colors.diverColor)
        HeightSpacer(value = 10.dp)
        Button(
            onClick = {

            },
        ) {
            Text("BUTTON")
        }
        HeightSpacer(value = 5.dp)
        Button(
            onClick = { },
            enabled = false
        ) {
            Text("DISABLED BUTTON")
        }
        HeightSpacer(value = 5.dp)
        BorderlessButton(
            onClick = { /*TODO*/ }
        ) {
            Text("BORDERLESS BUTTON")
        }
        HeightSpacer(value = 5.dp)
        BorderlessButton(
            onClick = { /*TODO*/ },
            enabled = false
        ) {
            Text("BORDERLESS DISABLED BUTTON")
        }
        HeightSpacer(value = 5.dp)
        LargeButton(
            onClick = {  },
        ) {
            Text("LARGE BUTTON")
        }
        HeightSpacer(value = 5.dp)
        LargeButton(
            onClick = { /*TODO*/ },
            enabled = false
        ) {
            Text("LARGE DISABLED BUTTON")
        }
        HeightSpacer(value = 5.dp)
        OutlinedButton(
            onClick = { /*TODO*/ },
        ) {
            Text("OUTLINED BUTTON")
        }
        HeightSpacer(value = 5.dp)
        OutlinedButton(
            onClick = { /*TODO*/ },
            enabled = false
        ) {
            Text("OUTLINED DISABLED BUTTON")
        }
    }
}
