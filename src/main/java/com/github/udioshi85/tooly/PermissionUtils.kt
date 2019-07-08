package com.github.udioshi85.tooly

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

fun hasAccessNetworkStatePermission(context: Context) = hasPermission(context, Manifest.permission.ACCESS_NETWORK_STATE)
fun hasPermission(context: Context, permission: String): Boolean = ContextCompat.checkSelfPermission(context, permission) == PackageManager.PERMISSION_GRANTED


/** External storage **/
fun hasWriteExternalStoragePermission(context: Context): Boolean = hasPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE)
fun requestExternalStoragePermission(activity: Activity, requestCode: Int) = ActivityCompat.requestPermissions(activity, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), requestCode)