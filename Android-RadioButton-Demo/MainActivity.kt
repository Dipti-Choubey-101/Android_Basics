package com.example.radiobuttons

import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById(R.id.radioGroup)

        radioGroup.clearCheck()

        radioGroup.setOnCheckedChangeListener { _, checkedId ->

            if (checkedId != -1) {
                val selectedRadioButton = findViewById<RadioButton>(checkedId)

                Toast.makeText(
                    this,
                    "${selectedRadioButton.text} selected",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
