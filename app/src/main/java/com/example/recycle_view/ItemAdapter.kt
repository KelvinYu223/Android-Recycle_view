package com.example.recycle_view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.recycle_view.R
import kotlinx.android.synthetic.main.item_another_custom_row.view.*
import kotlinx.android.synthetic.main.item_custom_row.view.*

class ItemAdapter (val context: Context, val items: ArrayList<DataModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object{
        const val VIEW_TYPE_ONE = 1
        const val VIEW_TYPE_TWO = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == VIEW_TYPE_ONE) {
            return ViewHolder(
                LayoutInflater.from(context).inflate(
                    R.layout.item_custom_row,
                    parent,
                    false
                )
            )
        } else {
            return AnotherViewHolder(
                LayoutInflater.from(context).inflate(
                    R.layout.item_another_custom_row,
                    parent,
                    false
                )
            )
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items.get(position)
        if (holder is ViewHolder) {
            holder.tvItem.text = item.itemName
            if (position % 2 == 0) {
                holder.cardViewItem.setBackgroundColor(
                    ContextCompat.getColor(
                        context,
                        R.color.colorLightGray
                    )
                )
            } else {
                holder.cardViewItem.setBackgroundColor(
                    ContextCompat.getColor(
                        context,
                        R.color.colorWhite
                    )
                )
            }
        }else if(holder is AnotherViewHolder) {
            holder.tvAnotherItemName.text = item.itemName
            if (position % 2 == 0) {
                holder.cardViewAnotherItem.setBackgroundColor(
                    ContextCompat.getColor(
                        context,
                        R.color.colorLightGray
                    )
                )
            } else {
                holder.cardViewAnotherItem.setBackgroundColor(
                    ContextCompat.getColor(
                        context,
                        R.color.colorWhite
                    )
                )
            }
        }
    }

    override fun getItemViewType(position: Int): Int{
        return items[position].viewType
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvItem = view.tv_item_name
        val cardViewItem = view.card_view_item
    }

    class AnotherViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvAnotherItemName = view.tv_another_item_name
        val cardViewAnotherItem = view.card_view_another_item
    }
}
