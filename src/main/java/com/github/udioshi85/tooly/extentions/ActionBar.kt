package com.github.udioshi85.tooly.extentions

import androidx.appcompat.app.ActionBar

fun ActionBar.showBackArrow() {
    this.setHomeButtonEnabled(true)
    this.setDisplayHomeAsUpEnabled(true)
}