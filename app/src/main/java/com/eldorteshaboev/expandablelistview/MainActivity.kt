package com.eldorteshaboev.expandablelistview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eldorteshaboev.expandablelistview.adapter.ExpandedAdapter
import com.eldorteshaboev.expandablelistview.adapter.Include
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var expandedAdapter: ExpandedAdapter
    lateinit var titleList: ArrayList<String>
    private lateinit var map: HashMap<String,List<Include>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        loadDate()
        expandedAdapter = ExpandedAdapter(titleList,map)
        expandableListView.setAdapter(expandedAdapter)


    }

    private fun loadDate() {
        titleList = ArrayList()
        map = HashMap()

        titleList.add("Fruit")
        titleList.add("Flowers")
        titleList.add("Animals")
         titleList.add("Birds")


        map[titleList[0]] = listOf(Include("Apple",R.drawable.free_icon_slot_machine_247788),
            Include("Mango",R.drawable.mango), Include
        ("Orange",R.drawable.orange), Include
        ("Banana",R.drawable.banana)
        )
        map[titleList[1]] = listOf(Include("Apple",R.drawable.free_icon_slot_machine_247788),
            Include("Mango",R.drawable.mango), Include
                ("Orange",R.drawable.orange),Include
                ("Banana",R.drawable.banana))
        map[titleList[2]] = listOf(Include("Apple",R.drawable.free_icon_slot_machine_247788),
            Include("Mango",R.drawable.mango), Include
                ("Orange",R.drawable.orange),Include
                ("Banana",R.drawable.banana))
        map[titleList[3]] = listOf(Include("Apple",R.drawable.free_icon_slot_machine_247788),
            Include("Mango",R.drawable.mango), Include
                ("Orange",R.drawable.orange),Include
                ("Banana",R.drawable.banana))


        }

    }



