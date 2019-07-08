package com.github.udioshi85.tooly

import android.os.FileObserver
import java.io.File
import java.util.*


abstract class RecursiveFileObserver(val path: String): FileObserver(path, ALL_EVENTS) {

    var observers= arrayListOf<SingleFileObserver>()

    override fun startWatching() {

        if (observers.isNotEmpty()) return

        val stack = Stack<String>()
        stack.push(path)

        while (!stack.empty()) {
            val parent = stack.pop()
            observers.add(SingleFileObserver(parent, ALL_EVENTS))
            val path = File(parent)
            val files = path.listFiles() ?: continue
            for (i in files.indices) {
                if (files[i].isDirectory && files[i].name != "." && files[i].name != "..") {
                    stack.push(files[i].path)
                }
            }
        }

        for (i in 0 until observers.size)
            observers[i].startWatching()
    }

    override fun stopWatching() {
        if (observers.size == 0) return

        for (i in 0 until observers.size)
            observers[i].stopWatching()

        observers.clear()
    }


    inner class SingleFileObserver(val path: String, mask: Int): FileObserver(path, mask) {

        override fun onEvent(event: Int, innerPath: String?) {
            this@RecursiveFileObserver.onEvent(event, "$path/$innerPath")
        }
    }
}