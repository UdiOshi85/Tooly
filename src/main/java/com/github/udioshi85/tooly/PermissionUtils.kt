package com.github.udioshi85.tooly

import android.content.Context
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat

fun hasAccessNetworkStatePermission(context: Context) = hasPermission(context, android.Manifest.permission.ACCESS_NETWORK_STATE)
fun hasPermission(context: Context, permission: String): Boolean = ContextCompat.checkSelfPermission(context, permission) == PackageManager.PERMISSION_GRANTED