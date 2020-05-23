package com.github.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivityFinal : AppCompatActivity() {

    lateinit var imgDice: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_final)
        val btnRoll: Button = findViewById(R.id.btn_roll)
        imgDice = findViewById(R.id.img_dice)
        btnRoll.setOnClickListener {
            rollDice();
        }

    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        imgDice.setImageResource(drawableResource)
    }
}
