package com.github.udioshi85.tooly.extentions

import android.view.View

fun View.setGone() {
    this.visibility = View.GONE
}

fun View.setVisible() {
    this.visibility = View.VISIBLE
}

fun View.setVisible(visible: Boolean) = if (visible) setVisible() else setGone()
