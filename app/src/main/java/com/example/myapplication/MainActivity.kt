package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.Mojprzycisk).setOnClickListener {
            findViewById<Button>(R.id.Mojprzycisk).text = "chyba dziala"
            findViewById<TextInputEditText>(R.id.MojTekstEdit).text
        }
    }
}