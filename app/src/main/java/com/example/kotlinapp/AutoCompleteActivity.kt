package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class AutoCompleteActivity : AppCompatActivity() {
    private val languages = arrayOf("Nepali", "Hindi", "English", "Chinese")
    private lateinit var autoComplete:AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete)

        autoComplete = findViewById(R.id.autoComplete)

        //For autocomplete textview
        val autoCompleteAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_checked,
            languages
        )
        autoComplete.setAdapter(autoCompleteAdapter)
        autoComplete.threshold = 1
    }
}