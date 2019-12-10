package com.github.udioshi85.tooly

import android.content.Context
import android.databinding.ViewDataBinding

/**
 * Simply getting the Context from the Binding root view.
 */
fun ViewDataBinding.getContext(): Context = this.root.context