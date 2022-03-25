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
        val helloTextView: TextView = findViewById(R.id.hello_world)
        helloTextView.text = "hello debugging!"
        division()
    }

    private fun division() {
        val numerator = 60
        var denominator = 4
        repeat(5) {
            Log.d(TAG,"${denominator}")
            Log.v(TAG, "${numerator / denominator}")
            denominator--
        }
    }
}