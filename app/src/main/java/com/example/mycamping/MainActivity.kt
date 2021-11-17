package com.example.mycamping
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
        private lateinit var button : Button
        private lateinit var imageButton: ImageButton
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
            imageButton = findViewById(R.id.imageButton3)
    }

    fun Good (view: View) {
        Log.d("My Tag", "Hello World")
    }

}