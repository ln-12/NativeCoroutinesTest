package com.example.nativecoroutinestest

import kotlinx.coroutines.flow.*

class SomeClass {
    private var _something = MutableStateFlow<Unit?>(null)
    val something = _something.asStateFlow()

    @OptIn(ExperimentalUnsignedTypes::class)
    fun doSomething() {}
}
