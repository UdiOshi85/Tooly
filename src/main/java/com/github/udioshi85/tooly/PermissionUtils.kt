package com.github.udioshi85.tooly

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

fun hasAccessNetworkStatePermission(context: Context) = hasPermission(context, Manifest.permission.ACCESS_NETWORK_STATE)
fun hasPermission(context: Context, permission: String): Boolean = ContextCompat.checkSelfPermission(context, permission) == PackageManager.PERMISSION_GRANTED


/** External storage (Read & write) **/
fun hasReadExternalStoragePermission(context: Context): Boolean = hasPermission(context, Manifest.permission.READ_EXTERNAL_STORAGE)
fun hasWriteExternalStoragePermission(context: Context): Boolean = hasPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE)

fun requestPermissionWriteExternalStorage(activity: Activity, requestCode: Int) = ActivityCompat.requestPermissions(activity, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), requestCode)
fun requestPermissionWriteExternalStorage(fragment: Fragment, requestCode: Int) = fragment.requestPermissions(arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), requestCode)

fun requestPermissionReadExternalStorage(activity: Activity, requestCode: Int) = ActivityCompat.requestPermissions(activity, arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), requestCode)
fun requestPermissionReadExternalStorage(fragment: Fragment, requestCode: Int) = fragment.requestPermissions(arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), requestCode)