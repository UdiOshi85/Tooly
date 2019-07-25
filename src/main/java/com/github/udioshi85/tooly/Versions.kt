package com.github.udioshi85.tooly

import android.os.Build

/**
 * Return True if is above/equal 21
 */
fun isLollipopOrAbove() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP

/**
 * Return True if is above/equal 23
 */
fun isMarshmelloOrAbove() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.M

/**
 * Return True if is above/equal 24
 */
fun isNugatOrAbove() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N

/**
 * Return True if is above/equal 26
 */
fun isOreoOrAbove() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O

/**
 * Return True if is above/equal 28
 */
fun isPieOrAbove() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.P