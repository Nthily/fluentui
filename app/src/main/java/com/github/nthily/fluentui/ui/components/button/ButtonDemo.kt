package com.github.nthily.fluentui.ui.components.button

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ButtonElevation
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.github.nthily.fluentui.ui.components.theme.FluentUi
import com.github.nthily.fluentui.ui.components.theme.FluentUiDemo
import com.github.nthily.fluentui.ui.components.theme.colors.LocalFluentUiColors
import com.github.nthily.fluentui.utils.components.HeightSpacer

@Composable
fun ButtonDemo() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(FluentUi.colors.backgroundColor)
            .padding(16.dp)
    ) {
        androidx.compose.material.Button(onClick = { /*TODO*/ }) {

        }
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
            onClick = {  },
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
