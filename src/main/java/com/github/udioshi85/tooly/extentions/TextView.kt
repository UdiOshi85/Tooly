package com.github.udioshi85.tooly.extentions

import android.widget.TextView

fun TextView.setDrawables(left: Int = 0, top: Int = 0, right: Int = 0, bottom: Int = 0) = setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom)