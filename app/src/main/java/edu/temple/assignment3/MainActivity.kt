package edu.temple.assignment3

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
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
            MyColorDataClass(
            "Choose a color",
            ""
            ),
            MyColorDataClass(
                "Blue",
                "#0000FF"
            ),
            MyColorDataClass(
                "Teal",
                "#FF018786"
            ),
            MyColorDataClass(
                "Purple",
                "#FF3700B3"
            ),
            MyColorDataClass(
                "Light Purple",
                "#FFBB86FC"
            ),
            MyColorDataClass(
                "Green",
                "#00FF00"
            ),
            MyColorDataClass(
                "Red",
                "#FF0000"
            ),
            MyColorDataClass(
                "Yellow",
                "#FFFF00"
            ),
            MyColorDataClass(
                "Light Teal",
                "#FF03DAC5"
            ),
            MyColorDataClass(
                "Gray",
                "#555555"
            ),
            MyColorDataClass(
                "Pink",
                "#FFC0CB"
            ),
            MyColorDataClass(
                "Orange",
                "#FFA500"
            ),

        )
        // Bind views
        colorSpinner = findViewById(R.id.colorSpinner)
        layout = findViewById(R.id.layout)

        colorSpinner.adapter = ColorAdapter(this,colors)

        //adding the listener to spinner
        colorSpinner.onItemSelectedListener = object: AdapterView.  OnItemSelectedListener{
            override fun onItemSelected(adapterView: AdapterView<*>, view: View?, i: Int, l: Long) {
                if (i != 0) //first index of 0 is not a color
                {
                    //view?.setBackgroundColor(Color.parseColor(adapterView!!.getItemAtPosition(i).toString()))
                }

            }
            override fun onNothingSelected(adapterView: AdapterView<*>) {
            }
        }
    }
    }
