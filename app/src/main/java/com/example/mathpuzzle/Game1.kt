package com.example.mathpuzzle

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar


class Game1 : AppCompatActivity() {

    lateinit var btnBack: ImageButton
    lateinit var txtLevel: TextView
    lateinit var btnEnter: Button
    lateinit var txtResult: EditText

    var level = ""
    val result = 32

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game1)

        btnBack = findViewById(R.id.btnBack)
        txtLevel = findViewById(R.id.txtLevel)
        btnEnter = findViewById(R.id.btnEnter)
        txtResult = findViewById(R.id.txtResult)


        var data = intent.getStringExtra("key1")
        if(data != null){
            level = data
        }
        txtLevel.setText("${txtLevel.text.toString()} $level")

        btnBack.setOnClickListener(){
            finish()
        }

        btnEnter.setOnClickListener(){
            if(result > txtResult.text.toString().toInt()){
                val snack: Snackbar = Snackbar.make(findViewById(android.R.id.content), "Yaklastın! Biraz daha yukarı çık.", Snackbar.LENGTH_LONG).setBackgroundTint(
                    Color.rgb(255, 114, 111))
                val view = snack.view
                val params = view.layoutParams as FrameLayout.LayoutParams
                params.gravity = Gravity.TOP
                view.layoutParams = params
                snack.show()
            } else if(result < txtResult.text.toString().toInt()){
                val snack: Snackbar = Snackbar.make(findViewById(android.R.id.content), "Yaklastın! Biraz daha aşağı in.", Snackbar.LENGTH_LONG).setBackgroundTint(
                    Color.rgb(255, 114, 111))
                val view = snack.view
                val params = view.layoutParams as FrameLayout.LayoutParams
                params.gravity = Gravity.TOP
                view.layoutParams = params
                snack.show()
            } else {
                val snack: Snackbar = Snackbar.make(findViewById(android.R.id.content), "Tebrikler! Doğru bildin.", Snackbar.LENGTH_LONG).setBackgroundTint(
                    Color.rgb(144, 238, 144))
                val view = snack.view
                val params = view.layoutParams as FrameLayout.LayoutParams
                params.gravity = Gravity.TOP
                view.layoutParams = params
                snack.show()
            }
        }
    }
}