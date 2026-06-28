package com.example.customizinganapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar=findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.example_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1->{
                sequenceOf(Toast.makeText(this@MainActivity,"Item 1 clicked", Toast.LENGTH_SHORT).show())
                return true
            }
            R.id.item2->{
                sequenceOf(Toast.makeText(this@MainActivity,"Item 2 clicked", Toast.LENGTH_SHORT).show())
                return true
            }
            R.id.item3->{
                sequenceOf(Toast.makeText(this@MainActivity,"Item 3 clicked", Toast.LENGTH_SHORT).show())
                return true
            }
            R.id.item1->{
                sequenceOf(Toast.makeText(this@MainActivity,"Item 1 clicked", Toast.LENGTH_SHORT).show())
                return true
            }
            R.id.subItem1->{
                sequenceOf(Toast.makeText(this@MainActivity,"Sub Item 1 clicked", Toast.LENGTH_SHORT).show())
                return true
            }
            R.id.subItem2->{
                sequenceOf(Toast.makeText(this@MainActivity,"Sub Item 2 clicked", Toast.LENGTH_SHORT).show())
                return true
            }
            else->{
                return super.onOptionsItemSelected(item)
            }
        }
    }
}
