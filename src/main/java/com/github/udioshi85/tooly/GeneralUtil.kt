package com.github.udioshi85.tooly

import android.content.Context
import android.content.pm.ApplicationInfo

fun isDebuggable(context: Context) = (context.applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE) != 0

