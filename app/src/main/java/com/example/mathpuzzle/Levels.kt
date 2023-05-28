package com.example.mathpuzzle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Levels : AppCompatActivity() {

    lateinit var btnBack:ImageButton
    lateinit var btn1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_levels)

        btnBack = findViewById(R.id.btnBack)
        btn1 = findViewById(R.id.btn1)


        btnBack.setOnClickListener(){
            finish()
        }

        btn1.setOnClickListener(){
            var intent = Intent(this, Game1::class.java)
            var level = btn1.text.toString()
            intent.putExtra("key1" , level)
            startActivity(intent)
        }


        var deger = "suleyman.--?  "
        var a = deger.split(".")  // ["suleyman", "--?  "]
        var b = a[0]  // "suleyman"
        print(b)  // suleyman


    }
}