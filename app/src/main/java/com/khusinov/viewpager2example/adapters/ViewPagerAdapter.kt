package com.khusinov.viewpager2example.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khusinov.viewpager2example.R
import kotlinx.android.synthetic.main.viewpager_item.view.*


class ViewPagerAdapter : RecyclerView.Adapter<ViewPagerAdapter.VH>() {

    private val colors = intArrayOf(
        android.R.color.black,
        android.R.color.holo_red_light,
        android.R.color.holo_blue_dark,
        android.R.color.holo_purple
    )

    inner class VH(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH =
        VH(LayoutInflater.from(parent.context).inflate(R.layout.viewpager_item, parent, false))


    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.itemView.tvTitle.text = "item $position"
        holder.itemView.container.setBackgroundColor(colors[position])
    }

    override fun getItemCount(): Int = colors.size

}