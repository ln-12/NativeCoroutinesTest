package com.example.nativecoroutinestest.android

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nativecoroutinestest.Greeting
import android.widget.TextView
import com.example.nativecoroutinestest.SomeClass

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet() + Greeting()
    }
}
