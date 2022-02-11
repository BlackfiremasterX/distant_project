package com.example.distant_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {


    var string_number = 0
    var string1 = "It's your chance to push NEXT button"
    var string2 = "Don't push NEXT button!"
    var string3 = "Pfff, i'm tired of it..."
    var string4 = "Go AWAY!!!"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.b_next).setOnClickListener {
            string_number++
            findViewById<TextView>(R.id.tv_click_counter).text = string_number.toString()
            when (string_number) {
                1 -> findViewById<TextView>(R.id.tv_test).text = string1
                2 -> findViewById<TextView>(R.id.tv_test).text = string2
                3 -> findViewById<TextView>(R.id.tv_test).text = string3
                4 -> findViewById<TextView>(R.id.tv_test).text = string4
                else -> findViewById<TextView>(R.id.tv_test).text = "ERROR"
            }
            if(string_number>3) {
                string_number = 0
            }
        }
        findViewById<Button>(R.id.b_back).setOnClickListener {
            string_number--
            findViewById<TextView>(R.id.tv_click_counter).text = string_number.toString()
            when (string_number) {
                1 -> findViewById<TextView>(R.id.tv_test).text = string1
                2 -> findViewById<TextView>(R.id.tv_test).text = string2
                3 -> findViewById<TextView>(R.id.tv_test).text = string3
                4 -> findViewById<TextView>(R.id.tv_test).text = string4
                else -> findViewById<TextView>(R.id.tv_test).text = "ERROR"
            }
            if(string_number<0) {
                string_number = 0
            }
        }
    }
}