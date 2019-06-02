package com.github.udioshi85.tooly.extentions

import android.content.Context
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

/**
 * Returns the color value from a given color resouse
 */
fun Context.getColorCompat(@ColorRes colorRes: Int) = ContextCompat.getColor(this, colorRes)