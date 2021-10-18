package com.example.reviewbuttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num = findViewById<TextView>(R.id.tvNum)
        var addBtn = findViewById<Button>(R.id.add)
        var minusBtn = findViewById<Button>(R.id.minus)

        addBtn.setOnClickListener {
            var textNum = num.text.toString().toInt()
            textNum++
            num.text = textNum.toString()
        }

        minusBtn.setOnClickListener {
            var textNum = num.text.toString().toInt()
            textNum--
            num.text = textNum.toString()
        }

    }
}