package com.github.udioshi85.tooly.extentions

import android.view.View

fun View.setGone() { this.visibility = View.GONE }

fun View.setVisible() { this.visibility = View.VISIBLE }

fun View.setInvisible() { this.visibility = View.INVISIBLE }

fun View.setVisible(isVisible: Boolean) = if (isVisible) setVisible() else setGone()
