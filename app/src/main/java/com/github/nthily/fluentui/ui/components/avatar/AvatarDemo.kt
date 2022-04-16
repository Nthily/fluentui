package com.github.nthily.fluentui.ui.components.avatar

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
        HeightSpacer(value = 10.dp)
        Text("Square style", fontSize = 30.sp)
        Divider(thickness = 1.dp, modifier = Modifier.fillMaxWidth())
        HeightSpacer(value = 10.dp)
        SquareStyle()
    }
}

@Composable
fun CircleStyle() {
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
                    style = AvatarStyle.Circle,
                    size = it.size,
                )
            }
            HeightSpacer(value = 3.dp)
        }
    }
}

@Composable
fun SquareStyle() {
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
                    style = AvatarStyle.Square,
                    size = it.size,
                )
            }
            HeightSpacer(value = 3.dp)
        }
    }
}

internal val people = listOf(
    People(AvatarSize.XXLarge, R.drawable.avatar_allan_munger),
    People(AvatarSize.XLarge, R.drawable.avatar_amanda_brady),
    People(AvatarSize.Large, R.drawable.avatar_ashley_mccarthy),
    People(AvatarSize.Medium, R.drawable.avatar_carlos_slattery),
    People(AvatarSize.Small, R.drawable.avatar_carole_poland),
    People(AvatarSize.XSmall, R.drawable.avatar_cecil_folk)
)

internal data class People(
    val size: AvatarSize,
    val resId: Int
)
