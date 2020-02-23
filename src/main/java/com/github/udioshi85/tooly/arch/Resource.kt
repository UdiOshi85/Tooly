package com.github.udioshi85.tooly.arch

import android.os.Bundle

/**
 * A generic class that holds a value with its loading status.
 * @param <T>
</T> */
data class Resource<out T>(val status: Status, val actionType: Int, val data: T?, val payload: Bundle?) {
    companion object {
        fun <T> success(actionType: Int, data: T? = null, payload: Bundle? = null): Resource<T> {
            return Resource(Status.SUCCESS,actionType,  data, payload)
        }

        fun <T> error(actionType: Int, data: T? = null, payload: Bundle? = null): Resource<T> {
            return Resource(Status.ERROR, actionType, data, payload)
        }

        fun <T> loading(actionType: Int, data: T? = null, payload: Bundle? = null): Resource<T> {
            return Resource(Status.LOADING, actionType,  data, payload)
        }
    }
}
