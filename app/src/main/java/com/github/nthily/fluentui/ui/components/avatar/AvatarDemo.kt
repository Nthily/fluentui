package com.github.nthily.fluentui.ui.components.avatar

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.nthily.fluentui.R
import com.github.nthily.fluentui.utils.components.CenterRow
import com.github.nthily.fluentui.utils.components.HeightSpacer
import com.github.nthily.fluentui.utils.components.WidthSpacer

@Composable
fun AvatarDemo() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(14.dp),
    ) {
        Text("Circle style", fontSize = 30.sp)
        Divider(thickness = 1.dp, modifier = Modifier.fillMaxWidth())
        HeightSpacer(value = 10.dp)
        CircleStyle()
    }
}

@Composable
fun CircleStyle() {
    val people = listOf(
        People(AvatarStyle.CIRCLE, AvatarSize.XXLARGE, R.drawable.avatar_allan_munger),
        People(AvatarStyle.CIRCLE, AvatarSize.XLARGE, R.drawable.avatar_amanda_brady),
        People(AvatarStyle.CIRCLE, AvatarSize.LARGE, R.drawable.avatar_ashley_mccarthy),
        People(AvatarStyle.CIRCLE, AvatarSize.MEDIUM, R.drawable.avatar_carlos_slattery),
        People(AvatarStyle.CIRCLE, AvatarSize.SMALL, R.drawable.avatar_carole_poland),
        People(AvatarStyle.CIRCLE, AvatarSize.XSMALL, R.drawable.avatar_cecil_folk)
    )
    Column {
        people.forEach {
            CenterRow(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(it.size.toString(), modifier = Modifier.width(60.dp))
                WidthSpacer(value = 16.dp)
                Avatar(
                    painter = painterResource(it.resId),
                    contentDescription = null,
                    style = it.style,
                    size = it.size,
                )
            }
            HeightSpacer(value = 3.dp)
        }
    }
}

data class People(
    val style: AvatarStyle,
    val size: AvatarSize,
    val resId: Int
)
