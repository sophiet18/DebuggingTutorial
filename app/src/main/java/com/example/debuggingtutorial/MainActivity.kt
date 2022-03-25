package com.example.debuggingtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

private const val TAG = "MainActivity"
//the log tag is typically declared outside of the class. Even though this variable is declared outside of the class, it's declared to be private so it will only be accessible in this file

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"this is where the app crashed before ")
        val helloTextView: TextView = findViewById(R.id.hello_world)
        helloTextView.text = "hello debugging!"
        Log.d(TAG,"this should be logged if the bug is resolved")
    }
}