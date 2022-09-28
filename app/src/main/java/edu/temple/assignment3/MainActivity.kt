package edu.temple.assignment3

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var colorSpinner: Spinner
    lateinit var layout: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colors = arrayOf(
                "Choose a color", "Red", "Yellow", "Blue", "Green", "Gray",
                "Orange", "Black", "Pink", "Purple"
        )
        // Bind views
        colorSpinner = findViewById(R.id.colorSpinner)
        layout = findViewById(R.id.layout)

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, colors)
        colorSpinner.adapter = arrayAdapter

    }
}