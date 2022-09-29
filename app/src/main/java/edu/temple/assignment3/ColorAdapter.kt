package edu.temple.assignment3

import android.content.Context
import android.view.LayoutInflater
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ColorAdapter(_context: Context, _colors: Array<MyColorDataClass>) : BaseAdapter() {

    private val context = _context
    private val colors = _colors

    override fun getCount(): Int {
        return colors.size
    }

    override fun getItem(position: Int): Any {
        return colors[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView

        if (convertView != null) {
            textView = convertView as TextView
        } else {
            textView = TextView(context)
            textView.textSize = 22f
            textView.setPadding(5, 10, 0, 10)
        }

        textView.text = colors[position]._colorName

        if (position == 0) //first index of 0 is not a color
        {
            //val colorTextView = adapterView.findViewById<TextView>(R.id.color_text_view)
            textView.setBackgroundColor(Color.WHITE)

            //textView.setBackgroundColor(Color.parseColor(colors[position]))
        }
        else {
            textView.setBackgroundColor(Color.parseColor(colors[position]._colorCode))
        }
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return super.getDropDownView(position, convertView, parent)
//            .apply {setBackgroundColor(Color.parseColor("white"))
//        }
    }

}