package com.github.nthily.fluentui.sample

import com.github.nthily.fluentui.component.divider.Divider
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.github.nthily.fluentui.component.button.*
import com.github.nthily.fluentui.component.theme.FluentUi
import com.github.nthily.fluentui.core.common.HeightSpacer
import com.github.nthily.fluentui.core.common.WidthSpacer

@Composable
fun ButtonSample() {
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
        Divider(thickness = 1.dp, color = FluentUi.colors.dividerColor)
        HeightSpacer(value = 10.dp)
        Button(
            onClick = {

            },
        ) {
            Text("BUTTON")
        }
        HeightSpacer(value = 5.dp)
        Button(
            onClick = {

            },
            modifier = Modifier.width(250.dp),
            values = ButtonDefault.buttonValues(backgroundColor = Color.Gray)
        ) {
            Icon(Icons.Rounded.Favorite, null)
            WidthSpacer(value = 5.dp)
            Text("CUSTOM BUTTON")
        }
        HeightSpacer(value = 10.dp)
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
            onClick = {

            },
            modifier = Modifier.width(250.dp).height(250.dp)
        ) {
            Text("CUSTOM OUTLINED BUTTON")
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
