package com.example.customviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = TextView ( this )
        textView.text = "Hola vistas personalizadas"
        setContentView (textView)
    }
}
