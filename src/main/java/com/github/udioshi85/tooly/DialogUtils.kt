package com.github.udioshi85.tooly

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface


fun createPositiveNegativeMessageDialog(context: Context, message: String,
                                        positiveLabel: String, onPositiveClickedListener: DialogInterface.OnClickListener, negativeLabel: String): AlertDialog {

    return AlertDialog.Builder(context)
        .setMessage(message)
        .setPositiveButton(positiveLabel, onPositiveClickedListener)
        .setNegativeButton(negativeLabel, null)
        .create()
}

fun createPositiveMessageDialog(context: Context, message: String, buttonText: String, title: String?): AlertDialog {
    val dialog = AlertDialog.Builder(context)
        .setMessage(message)
        .setPositiveButton(buttonText, null)
        .create()

    if (title != null) {
        dialog.setTitle(title)
    }

    return dialog
}

