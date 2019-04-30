package com.github.udioshi85.tooly

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager

/**
 * Checks whether the device is has active inter connection.
 * Permission android.Manifest.permission.ACCESS_NETWORK_STATE required
 */
@SuppressLint("MissingPermission")
fun hasConnection(context: Context): Boolean {
    return try {

        return if (hasAccessNetworkStatePermission(context)) {
            val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val activeNetworkInfo = connectivityManager.activeNetworkInfo
            activeNetworkInfo != null && activeNetworkInfo.isConnected
        } else {
            false
        }

    } catch (e: Exception) {
        false
    }
}