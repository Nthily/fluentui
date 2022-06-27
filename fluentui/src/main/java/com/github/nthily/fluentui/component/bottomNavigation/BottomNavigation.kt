package com.github.nthily.fluentui.component.bottomNavigation

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.*
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.layout.*
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.github.nthily.fluentui.component.theme.FluentUi
import kotlin.math.max
import kotlin.math.roundToInt

@Composable
fun BottomNavigation(
    modifier: Modifier = Modifier,
    backgroundColor: Color = FluentUi.colors.bottomNavigationBackgroundColor,
    elevation: Dp = BottomNavigationDefaults.Elevation,
    content: @Composable RowScope.() -> Unit
) {
    Surface(
        color = backgroundColor,
        elevation = elevation,
        modifier = modifier
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .height(BottomNavigationHeight)
                .selectableGroup(),
            horizontalArrangement = Arrangement.SpaceBetween,
            content = content
        )
    }
}

@Composable
fun RowScope.BottomNavigationItem(
    icon: @Composable () -> Unit,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    label: @Composable (() -> Unit)? = null,
    alwaysShowLabel: State<Boolean> = remember { mutableStateOf(true) },
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    selectedContentColor: Color = FluentUi.colors.bottomNavigationForegroundActiveColor,
    unselectedContentColor: Color = FluentUi.colors.bottomNavigationForegroundInactiveColor
) {
    val realLabel = if (alwaysShowLabel.value) label else null
    val styledLabel: @Composable (() -> Unit)? = realLabel?.let {
        @Composable {
            ProvideTextStyle(FluentUi.typography.caption, content = realLabel)
        }
    } ?: run { null }
    val ripple = rememberRipple(bounded = false, color = FluentUi.colors.buttonBackgroundPressedColor)
    Box(
        modifier
            .selectable(
                selected = selected,
                onClick = onClick,
                enabled = enabled,
                role = Role.Tab,
                interactionSource = interactionSource,
                indication = ripple
            )
            .weight(1f),
        contentAlignment = Alignment.Center
    ) {
       BottomNavigationTransition(
            selectedContentColor,
            unselectedContentColor,
            selected
        ) { progress ->
            val animationProgress = if (alwaysShowLabel.value) 1f else progress
            BottomNavigationItemBaselineLayout(
                icon = icon,
                label = styledLabel,
                iconPositionAnimationProgress = animationProgress
            )
        }
    }
}

@Composable
private fun BottomNavigationTransition(
    activeColor: Color,
    inactiveColor: Color,
    selected: Boolean,
    content: @Composable (animationProgress: Float) -> Unit
) {
    val animationProgress by animateFloatAsState(
        targetValue = if (selected) 1f else 0f,
        animationSpec = BottomNavigationAnimationSpec
    )

    val color = lerp(inactiveColor, activeColor, animationProgress)

    CompositionLocalProvider(
        LocalContentColor provides color.copy(alpha = 1f),
        LocalContentAlpha provides color.alpha,
    ) {
        content(animationProgress)
    }
}

@Composable
private fun BottomNavigationItemBaselineLayout(
    icon: @Composable () -> Unit,
    label: @Composable (() -> Unit)?,
    iconPositionAnimationProgress: Float
) {
    Layout(
        {
            Box(Modifier.layoutId("icon")) { icon() }
            if (label != null) {
                Box(
                    Modifier
                        .layoutId("label")
                        .alpha(iconPositionAnimationProgress)
                        .padding(horizontal = BottomNavigationItemHorizontalPadding)
                ) { label() }
            }
        }
    ) { measurables, constraints ->
        val iconPlaceable = measurables.first { it.layoutId == "icon" }.measure(constraints)

        val labelPlaceable = label?.let {
            measurables.first { it.layoutId == "label" }.measure(
                constraints.copy(minHeight = 0)
            )
        }

        if (label == null) {
            placeIcon(iconPlaceable, constraints)
        } else {
            placeLabelAndIcon(
                labelPlaceable!!,
                iconPlaceable,
                constraints,
                iconPositionAnimationProgress
            )
        }
    }
}

private fun MeasureScope.placeIcon(
    iconPlaceable: Placeable,
    constraints: Constraints
): MeasureResult {
    val height = constraints.maxHeight
    val iconY = (height - iconPlaceable.height) / 2
    return layout(iconPlaceable.width, height) {
        iconPlaceable.placeRelative(0, iconY)
    }
}

private fun MeasureScope.placeLabelAndIcon(
    labelPlaceable: Placeable,
    iconPlaceable: Placeable,
    constraints: Constraints,
    iconPositionAnimationProgress: Float
): MeasureResult {
    val height = constraints.maxHeight

    val baseline = labelPlaceable[LastBaseline]

    val baselineOffset = CombinedItemTextBaseline.roundToPx()

    val labelY = height - baseline - baselineOffset

    val unselectedIconY = (height - iconPlaceable.height) / 2
    val selectedIconY = height - (baselineOffset * 2) - iconPlaceable.height
    val containerWidth = max(labelPlaceable.width, iconPlaceable.width)

    val labelX = (containerWidth - labelPlaceable.width) / 2
    val iconX = (containerWidth - iconPlaceable.width) / 2
    val iconDistance = unselectedIconY - selectedIconY
    val offset = (iconDistance * (1 - iconPositionAnimationProgress)).roundToInt()
    return layout(containerWidth, height) {
        if (iconPositionAnimationProgress != 0f) {
            labelPlaceable.placeRelative(labelX, labelY + offset)
        }
        iconPlaceable.placeRelative(iconX, selectedIconY + offset)
    }
}

private val BottomNavigationAnimationSpec = TweenSpec<Float>(
    durationMillis = 300,
    easing = FastOutSlowInEasing
)

private val BottomNavigationHeight = 56.dp
private val BottomNavigationItemHorizontalPadding = 12.dp
private val CombinedItemTextBaseline = 12.dp