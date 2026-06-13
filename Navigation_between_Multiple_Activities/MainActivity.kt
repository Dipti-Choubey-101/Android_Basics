package com.example.navigationbetweenmultipleactivities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var goToButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToButton=findViewById(R.id.button_go_to_act)
        goToButton.setOnClickListener{
            val intent=Intent(this@MainActivity,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
