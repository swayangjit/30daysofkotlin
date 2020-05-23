package com.github.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnRoll: Button = findViewById(R.id.btn_roll)
        btnRoll.setOnClickListener {
            rollDice();
        }
        val btnCountUp: Button = findViewById(R.id.btn_countup);
        btnCountUp.setOnClickListener{
            countUp()
        }

        val btnReset: Button = findViewById(R.id.btn_reset);
        btnReset.setOnClickListener{
            reset()
        }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val txtResult: TextView = findViewById(R.id.txt_result);
        txtResult.text = randomInt.toString()
    }

    private fun countUp() {
        val txtResult: TextView = findViewById(R.id.txt_result);
        if (txtResult.text == "Hello World!") {
            txtResult.text = "1"
        } else {

            var resultInt = txtResult.text.toString().toInt()
            if(resultInt < 6){
                resultInt++
            }
            txtResult.text = resultInt.toString()
        }

    }

    private fun reset() {
        val txtResult: TextView = findViewById(R.id.txt_result);
        txtResult.text = "0"
    }
}
