package com.example.zadanie0302lach

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }

        private fun setupAutoCompleteTextView() {
            val button = findViewById<Button>(R.id.btnSubmit)
            val textInput = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
            val countries = resources.getStringArray(R.array.countries_array)
            // Create the adapter and set it to the AutoCompleteTextView
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countries)
            button.setOnClickListener { textInput.setAdapter(adapter) }

            button.setOnClickListener {
                val enteredText = getString(R.string.entered_text) + " " + textInput.text
                Toast.makeText(this@MainActivity, enteredText, Toast.LENGTH_SHORT).show()

            }
        }
    }


