package com.github.nthily.fluentui.component.tooltip

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import com.github.nthily.fluentui.component.theme.FluentUi

@Composable
fun Tooltip(
    modifier: Modifier = Modifier,
    isVisible: Boolean = false,
    onDismissRequest: (() -> Unit)? = null,
    text: String,
    content: @Composable () -> Unit,
) {
    var triangleOffset by remember { mutableStateOf(0.dp) }
    var popUpOffset by remember { mutableStateOf(IntOffset(0, 0)) }
    val localDensity = LocalDensity.current

    Layout(
        modifier = modifier,
        content = {
            content()
            TooltipContent(
                text = text, triangleOffset = triangleOffset, isVisible = isVisible
            )
        }
    ) { measurables, constraints ->
        val placeables = measurables.map { measurable ->
            measurable.measure(constraints)
        }
        val contentWidth = placeables[0].width
        val contentHeight = placeables[0].height
        popUpOffset = IntOffset(0, contentHeight)

        if (isVisible) {
            val tooltipWidth = placeables[1].width
            val tooltipHeight = placeables[1].height

            triangleOffset = with(localDensity) {
                if (contentWidth <= tooltipWidth) {
                    contentWidth.toDp() / 2
                } else 0.dp
            }
            layout(contentWidth, contentHeight) {
                placeables[0].placeRelative(0, 0)
                if (contentWidth > tooltipWidth) {
                    placeables[1].placeRelative((contentWidth - tooltipWidth) / 2, contentHeight)
                } else {
                    placeables[1].placeRelative(0, contentHeight)
                }
            }
        } else {
            layout(contentWidth, contentHeight) {
                placeables[0].placeRelative(0, 0)
            }
        }
    }
}

@Composable
fun TooltipContent(
    modifier: Modifier = Modifier,
    text: String,
    triangleOffset: Dp,
    isVisible: Boolean
) {
    val backgroundColor = FluentUi.colors.tooltipBackgroundColor
    ProvideTextStyle(tooltipTextStyle) {
        if (isVisible) {
            Column(
                modifier = modifier.widthIn(max = tooltipMaxWidth)
            ) {
                Canvas(
                    modifier = Modifier
                        .size(
                            width = tooltipArrowWidth,
                            height = tooltipArrowHeight
                        )
                        .align(if (triangleOffset == 0.dp) Alignment.CenterHorizontally else Alignment.Start)
                        .offset(triangleOffset)
                ) {
                    val trianglePath = Path().apply {
                        val height = size.height
                        val width = size.width
                        moveTo(width / 2.0f, 0f)
                        lineTo(width, height)
                        lineTo(0f, height)
                    }
                    drawPath(trianglePath, color = backgroundColor)
                }
                Surface(
                    color = backgroundColor,
                    shape = RoundedCornerShape(tooltipRadius)
                ) {
                    Text(text, modifier = Modifier.padding(tooltipPaddingValues))
                }
            }
        }
    }
}

@Composable
fun TooltipImpl(
    onDismissRequest: (() -> Unit)? = null,
    text: String,
    isVisible: Boolean,
   // popUpOffset: IntOffset,
    triangleOffset: Dp
) {
    if (isVisible) {
        Popup(
            onDismissRequest = onDismissRequest,
            //offset = popUpOffset,
        ) {
            TooltipContent(text = text, triangleOffset = triangleOffset, isVisible = isVisible)
        }
    }
}

@Composable
fun rememberTooltipState(
    isVisible: Boolean = false
) : TooltipState = remember(isVisible) {
    TooltipState(isVisible)
}

class TooltipState(
    initialVisible: Boolean = false,
) {
    private var _isVisible by mutableStateOf(initialVisible)
    var isVisible
        get() = _isVisible
        internal set(value) {
            if (value != _isVisible) {
                _isVisible = value
            }
        }
}

// reference: https://github.com/microsoft/fluentui-android/blob/master/fluentui_transients/src/main/res/values/dimens.xml#L22

private val tooltipMaxWidth = 300.dp
private val tooltipArrowWidth = 14.dp
private val tooltipArrowHeight = 7.dp
private val tooltipMargin = 2.dp
private val tooltipPaddingValues = PaddingValues(vertical = 8.dp, horizontal = 12.dp)
private val tooltipRadius = 4.dp
private val tooltipBackgroundPadding = 2.dp
private val tooltipTextStyle @Composable get () =  FluentUi.typography.body2.copy(FluentUi.colors.tooltipTextColor)
