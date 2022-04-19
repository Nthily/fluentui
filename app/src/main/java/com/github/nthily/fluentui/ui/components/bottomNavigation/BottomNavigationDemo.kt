package com.github.nthily.fluentui.ui.components.bottomNavigation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.github.nthily.fluentui.ui.components.button.Button

@Composable
fun BottomNavigationDemo() {
    val screens = remember {
        mutableStateListOf(
            Screen("Alert", com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_alert_24_regular),
            Screen("New", com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_news_24_regular),
            Screen("Calendar", com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_calendar_ltr_24_regular)
        )
    }
    var selected by remember { mutableStateOf(0) }
    val alwaysShowLabel = remember { mutableStateOf(true) }

    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(
                onClick = { alwaysShowLabel.value = !alwaysShowLabel.value }
            ) {
                Text("TOGGLE LABELS")
            }
            Button(
                onClick = {
                    if (screens.size == 4) screens.removeAt(screens.size - 1)
                }
            ) {
                Text("SHOW THREE MENU ITEMS")
            }
            Button(
                onClick = {
                    if (screens.size == 3) screens.add(Screen("Team", com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_people_team_24_regular))
                }
            ) {
                Text("SHOW FOUR MENU ITEMS")
            }
        }
        BottomNavigation(
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            screens.forEachIndexed { index, screen ->
                BottomNavigationItem(
                    selected = selected == index,
                    icon = { Icon(painterResource(screen.res), null) },
                    label = { Text(text = screen.label) },
                    onClick = { selected = index },
                    alwaysShowLabel = alwaysShowLabel
                )
            }
        }
    }

}

data class Screen(
    val label: String,
    val res: Int
)
