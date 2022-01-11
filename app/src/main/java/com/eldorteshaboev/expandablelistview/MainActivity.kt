package com.eldorteshaboev.expandablelistview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eldorteshaboev.expandablelistview.adapter.ExpandedAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var expandedAdapter: ExpandedAdapter
    lateinit var titleList: ArrayList<String>
    lateinit var map: HashMap<String,List<String>>

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

        titleList.add("Real")
        titleList.add("Barca")
        titleList.add("Liverpool")

        map[titleList[0]] = listOf("Benzema","Nacho","Mendy")
        map[titleList[1]] = listOf("Messi","Pique","Xavi")
        map[titleList[2]] = listOf("Salah","Arnold","Milner")
    }
}