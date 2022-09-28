package edu.temple.assignment3

import android.content.Context
import android.view.LayoutInflater
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ColorAdapter(mainActivity: MainActivity, colors: Array<String>): BaseAdapter () {
    private val colors: Array<String>
    private var inflater: LayoutInflater? = null
    private val context: Context

    override fun getCount(): Int {
        return colors.size
    }

    override fun getItem(i: Int): Any {
        return i
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    //holder class is to hold items in spinner, only textview in spinner
    class Holder {
        var colorTextView: TextView? = null
    }

    override fun getView(i: Int, convertView: View, viewGroup: ViewGroup?): View {
        var myView = convertView
        val holder: Holder

        //initialize spinner
        if (myView == null) {
            inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            myView = inflater!!.inflate(R.layout.layout_spinner, null)

            myView.setBackgroundColor(Color.WHITE)
            holder = Holder()
            holder.colorTextView = myView.findViewById(R.id.color_text_view)
            myView.tag = holder
        } else {
            //if spinner initialized already
            holder = myView.tag as Holder
        }

        //set text in spinner text view
        holder.colorTextView!!.text = colors[i]

        //set color of background of textview in spinner
        if (i != 0)
            holder.colorTextView!!.setBackgroundColor(Color.parseColor(colors[i]))
        //return view
        return myView
    }

    init {
        context = MainActivity()
        this.colors = colors
    }
}

