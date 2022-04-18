package com.github.nthily.fluentui.ui.components.button

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.github.nthily.fluentui.ui.components.theme.FluentUi
import com.github.nthily.fluentui.utils.components.HeightSpacer

@Composable
fun ButtonDemo() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Button",
            style = FluentUi.typography.headline
        )
        HeightSpacer(value = 10.dp)
        Divider(thickness = 1.dp, color = FluentUi.colors.diverColor)
        HeightSpacer(value = 10.dp)
        Button(
            onClick = { },
        ) {
            Text("BUTTON")
        }
        Button(
            onClick = { },
            enabled = false
        ) {
            Text("DISABLED BUTTON")
        }
        BorderlessButton(
            onClick = { /*TODO*/ }
        ) {
            Text("BORDERLESS BUTTON")
        }
        BorderlessButton(
            onClick = { /*TODO*/ },
            enabled = false
        ) {
            Text("BORDERLESS DISABLED BUTTON")
        }
        LargeButton(
            onClick = { /*TODO*/ },
        ) {
            Text("LARGE BUTTON")
        }
        LargeButton(
            onClick = { /*TODO*/ },
            enabled = false
        ) {
            Text("LARGE DISABLED BUTTON")
        }
        OutlinedButton(
            onClick = { /*TODO*/ },
        ) {
            Text("OUTLINED BUTTON")
        }
        OutlinedButton(
            onClick = { /*TODO*/ },
            enabled = false
        ) {
            Text("OUTLINED DISABLED BUTTON")
        }
    }
}
