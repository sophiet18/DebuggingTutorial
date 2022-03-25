package com.example.debuggingtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"
//the log tag is typically declared outside of the class. Even though this variable is declared outside of the class, it's declared to be private so it will only be accessible in this file

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
    }
    fun logging(){
        Log.v(TAG, "Hello World")
    }
}