package com.example.mathpuzzle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnPlay:Button
    lateinit var btnExit: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlay = findViewById(R.id.btnPlay)
        btnExit = findViewById(R.id.btnExit)

        btnPlay.setOnClickListener(){
            var intent = Intent(this, Levels::class.java)
            startActivity(intent)
        }

        btnExit.setOnClickListener(){
            finish()
        }
    }
}