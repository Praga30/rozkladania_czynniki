package com.ft_ss.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numerin = findViewById<TextView>(R.id.text_input)
        var wyswietlanie = findViewById<TextView>(R.id.textView)
        var button = findViewById<Button>(R.id.licznik)

        button.setOnClickListener {
            var n = numerin.text.toString().toInt()

            var i = 2
            var czynnik = ""

            while (n > 1)
            {
                while (n % i == 0)
                {
                    czynnik += (i.toString() + "  ")

                    n /= i
                }

                ++i
            }

            wyswietlanie.text = ("czynniki: " + czynnik)
        }
    }
}