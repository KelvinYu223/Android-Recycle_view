package com.example.recycle_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler_view_items.layoutManager = LinearLayoutManager(this)
        val itemAdapter = ItemAdapter(this, getItemsList())
        recycler_view_items.adapter = itemAdapter
    }

    private fun getItemsList(): ArrayList<DataModel> {
        val list = ArrayList<DataModel>()
        list.add(DataModel("Item 1 ViewType 1", ItemAdapter.VIEW_TYPE_ONE))
        list.add(DataModel("Item 2 ViewType 2", ItemAdapter.VIEW_TYPE_TWO))
        list.add(DataModel("Item 3 ViewType 1", ItemAdapter.VIEW_TYPE_ONE))
        list.add(DataModel("Item 4 ViewType 2", ItemAdapter.VIEW_TYPE_TWO))
        list.add(DataModel("Item 5 ViewType 1", ItemAdapter.VIEW_TYPE_ONE))
        list.add(DataModel("Item 6 ViewType 1", ItemAdapter.VIEW_TYPE_ONE))
        list.add(DataModel("Item 7 ViewType 2", ItemAdapter.VIEW_TYPE_TWO))
        list.add(DataModel("Item 8 ViewType 1", ItemAdapter.VIEW_TYPE_ONE))
        list.add(DataModel("Item 9 ViewType 2", ItemAdapter.VIEW_TYPE_TWO))
        list.add(DataModel("Item 10 ViewType 2", ItemAdapter.VIEW_TYPE_TWO))
        list.add(DataModel("Item 11 ViewType 1", ItemAdapter.VIEW_TYPE_ONE))
        list.add(DataModel("Item 12 ViewType 2", ItemAdapter.VIEW_TYPE_TWO))
        return list
    }
}
