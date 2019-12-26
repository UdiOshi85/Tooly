package com.github.udioshi85.tooly.extentions

import android.app.Activity
import android.view.WindowManager
import androidx.annotation.ColorRes
import com.github.udioshi85.tooly.isLollipopOrAbove

/**
 * Sets the status bar for this activity.
 * Only above Lollipop devices.
 */
fun Activity.setStatusBarColor(@ColorRes colorRes: Int) {
    if (isLollipopOrAbove()) {
        window?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window?.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window?.statusBarColor = getColorCompat(colorRes)
    }
}