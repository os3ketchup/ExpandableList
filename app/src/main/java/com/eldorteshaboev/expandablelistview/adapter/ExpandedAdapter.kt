package com.eldorteshaboev.expandablelistview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import com.eldorteshaboev.expandablelistview.R
import kotlinx.android.synthetic.main.item_child.view.*
import kotlinx.android.synthetic.main.item_group.view.*


class ExpandedAdapter(
    var titleList: List<String>,
    var map: HashMap<String,
            List<String>>
) :
    BaseExpandableListAdapter() {


    override fun getGroupCount(): Int {
        return titleList.size
    }

    override fun getChildrenCount(p0: Int): Int {
        return map[titleList[p0]]!!.size
    }

    override fun getGroup(p0: Int): Any {
        return titleList[p0]
    }

    override fun getChild(p0: Int, p1: Int): Any {
        return map[titleList[p0]]!![p1]
    }

    override fun getGroupId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getChildId(p0: Int, p1: Int): Long {
        return p1.toLong()
    }

    override fun hasStableIds(): Boolean {
        return true
    }

    override fun getGroupView(
        p0: Int,
        p1: Boolean,
        p2: View?,
        p3: ViewGroup?
    ): View {
        val itemView: View
        if (p2 == null) {
            itemView = LayoutInflater.from(p3?.context).inflate(R.layout.item_group, p3, false)
        } else {
            itemView = p2
        }
        itemView.itGroup.text = titleList[p0]

        return itemView
    }

    override fun getChildView(
        p0: Int,
        p1: Int,
        p2: Boolean,
        p3: View?,
        p4: ViewGroup?
    ): View {
        var itemView:View
        if (p3==null){
            itemView = LayoutInflater.from(p4?.context).inflate(R.layout.item_child,p4,false)
        } else{
            itemView = p3
        }
itemView.itChild.text = map[titleList[p0]]!![p1]

        return itemView
    }

    override fun isChildSelectable(p0: Int, p1: Int): Boolean {
        return true
    }

}