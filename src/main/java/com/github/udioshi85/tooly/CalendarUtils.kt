package com.github.udioshi85.tooly

import com.github.udioshi85.tooly.extentions.getFormattedTime
import java.util.*

/**
 * Example: Nov, 25
 */
const val FORMAT_MMM_DD = "MMM, dd"

fun getFormattedTime(format: String): String = Calendar.getInstance().getFormattedTime(format)