package com.oliva.chatappclone.data

open class Event<out T>(private val content: T) {
    var hasBeenhandled = false
        private set

    fun getContentOrNull(): T? {
        return if (hasBeenhandled)
            null
        else {
            hasBeenhandled = true
            content
        }
    }
}