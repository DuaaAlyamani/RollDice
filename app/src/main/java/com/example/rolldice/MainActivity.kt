package com.example.rolldice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // create a instant from type Button to declare the Button from its id
        val rollButton: Button = findViewById(R.id.button)
        // add lisner for the button click
        // when the user click on the button a message will apper and the
        //dice will be diced
        rollButton.setOnClickListener {

            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
            rollDice()
            val diceImage: ImageView = findViewById(R.id.imageView)

        }
    }

    // this function will call the roll function from dice class and decide
    // which image will be show to the user
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        // select the image by using if statments
        /* if (diceRoll == 1) {
            diceImage.setImageResource(R.drawable.dice_1)}
        if (diceRoll == 2) {
            diceImage.setImageResource(R.drawable.dice_2)}
        if (diceRoll == 3) {
            diceImage.setImageResource(R.drawable.dice_3)}
        if (diceRoll == 4) {
            diceImage.setImageResource(R.drawable.dice_4)}
        if (diceRoll == 5) {
            diceImage.setImageResource(R.drawable.dice_5)}
         else if (diceRoll == 6) {
            diceImage.setImageResource(R.drawable.dice_6)
        }*/
        // select the image by using when
        when (diceRoll) {

            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }

    }

    // a Dice class that contains the roll function to roll the Dice
    class Dice(val diceNumber: Int) {
        fun roll(): Int {
            return (1..diceNumber).random()
        }
    }
}