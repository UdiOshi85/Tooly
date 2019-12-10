package com.github.udioshi85.tooly

import com.github.udioshi85.tooly.extentions.getFormattedTime
import java.util.*

const val FORMAT_MMM_DD = "MMM, dd"
fun getFormattedTime(format: String): String = Calendar.getInstance().getFormattedTime(format)