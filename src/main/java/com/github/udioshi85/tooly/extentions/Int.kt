package com.github.udioshi85.tooly.extentions

import android.content.res.Resources

/**
 * Converts a given Int to dp according to device density
 */
val Int.toDp: Int
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()

/**
 * Converts a give Int to px according to device density
 */
val Int.toPx: Int
    get() = (this / Resources.getSystem().displayMetrics.density).toInt()