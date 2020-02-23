package com.github.udioshi85.tooly.extentions

import androidx.core.widget.NestedScrollView
import kotlin.math.max

fun NestedScrollView.getVerticalScrollRange(): Int {
    return if (childCount > 0) {
        val child = getChildAt(0)
        max(0, child.height - (height - paddingBottom - paddingTop))

    } else {
        0
    }
}