package edu.temple.assignment3

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.TextView
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

        val arrayAdapter = ColorAdapter(this@MainActivity, colors)
        colorSpinner.adapter = arrayAdapter

        //adding the listener to spinner
        colorSpinner.onItemSelectedListener = object: AdapterView.  OnItemSelectedListener{
            override fun onItemSelected(adapterView: AdapterView<*>, view: View?, i: Int, l: Long) {
                if (i !=0) //first index of 0 is not a color
                {
                    val colorTextView = adapterView.findViewById<TextView>(R.id.color_text_view)
                    colorTextView.setBackgroundColor(Color.WHITE)

                    layout.setBackgroundColor(Color.parseColor(colors[i]))
                }
            }

            override fun onNothingSelected(adapterView: AdapterView<*>) {
            }
        }
    }
}