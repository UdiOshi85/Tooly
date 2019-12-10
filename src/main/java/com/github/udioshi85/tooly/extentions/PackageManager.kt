package com.github.udioshi85.tooly.extentions

import android.content.Context
import android.content.pm.PackageManager
import java.util.concurrent.TimeUnit

fun PackageManager.installTimeInDays(context: Context): Long = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - getPackageInfo(context.packageName, 0).firstInstallTime)
