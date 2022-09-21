package com.example.matematika_2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView


class Adapter(
    private  val list: List<Item>,
    private  val context: Context
): BaseAdapter() {

    private var layoutInflater: LayoutInflater?=null
    private lateinit var text:TextView
    private lateinit var image:CircleImageView

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView=convertView

        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }

        if (convertView == null) {
            // on below line we are passing the layout file
            // which we have to inflate for each item of grid view.
            convertView = layoutInflater!!.inflate(R.layout.grid_item, null)
        }

        image=convertView!!.findViewById(R.id.circle_img)
        text=convertView!!.findViewById(R.id.grid_name)

        image.setImageResource(list.get(position).image!!.toInt())
        text.setText(list.get(position).name)

        return convertView
    }

}