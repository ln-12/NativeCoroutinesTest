package com.example.nativecoroutinestest

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}