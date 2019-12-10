package com.github.udioshi85.tooly.extentions

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.getFormattedTime(format: String): String = SimpleDateFormat(format, Locale.getDefault()).format(time)