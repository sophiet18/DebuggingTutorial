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
        val helloTextView: TextView = findViewById(R.id.division_textview)
        helloTextView.text = getString(R.string.text)
        division()
    }
    fun division() {
        val numerator = 60
        var denominator = 4
        repeat(4) {
            Thread.sleep(10)
            findViewById<TextView>(R.id.division_textview).text = "${numerator / denominator}"
             Log.v(TAG, "${numerator / denominator}")
            denominator--
        }
    }
}