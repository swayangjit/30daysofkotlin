package com.github.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivityChallenge : AppCompatActivity() {

    lateinit var imgDice1: ImageView
    lateinit var imgDice2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_challenge)
        val btnRoll: Button = findViewById(R.id.btn_roll)
        imgDice1 = findViewById(R.id.img_dice1)
        imgDice2 = findViewById(R.id.img_dice2)
        btnRoll.setOnClickListener {
            rollDice();
        }

    }

    private fun rollDice(){
        imgDice1.setImageResource(getRandomDiceImage())
        imgDice2.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage(): Int {
        val randomInt = (1..6).random()
        return  when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}
