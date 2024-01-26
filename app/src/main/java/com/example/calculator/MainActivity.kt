package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onEqualClick(view: View) {}
    fun onDigitClick(view: View) {}
    fun onAllClearClick(view: View) {}
    fun onOperatorClick(view: View) {}
    fun onBackClick(view: View) {}
    fun onClearClick(view: View) {}
}