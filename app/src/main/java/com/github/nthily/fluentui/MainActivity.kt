package com.github.nthily.fluentui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.github.nthily.fluentui.sample.AvatarSample
import com.github.nthily.fluentui.ui.theme.FluentUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FluentUiTheme {
                AvatarSample()
            }
        }
    }
}
