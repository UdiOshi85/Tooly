package com.github.udioshi85.tooly

import android.os.Build

fun isLollipopOrAbove() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP

fun isMarshmelloOrAbove() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.M

fun isNugatOrAbove() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N

fun isOreoOrAbove() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O

fun isPieOrAbove() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.P