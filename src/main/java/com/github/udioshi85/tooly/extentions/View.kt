package com.github.udioshi85.tooly.extentions

import android.view.View

/**
 * Sets the view visibility to View.GONE
 */
fun View.setGone() { this.visibility = View.GONE }

/**
 * Sets the view visibility to View.VISIBLE
 */
fun View.setVisible() { this.visibility = View.VISIBLE }

/**
 * Sets the view visibility to View.INVISIBLE
 */
fun View.setInvisible() { this.visibility = View.INVISIBLE }

/**
 * Set View.Visible / View.GONE according to isVisible
 */
fun View.setVisible(isVisible: Boolean) = if (isVisible) setVisible() else setGone()
