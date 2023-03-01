package uz.itschool.expandablelistview

import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ExpandableListAdapter
import android.widget.ListAdapter

class Adapter(var titleList:ArrayList<String>, var map:MutableMap<String, ArrayList<String>>) :
    BaseExpandableListAdapter() {
    override fun getGroupCount(): Int {
        return titleList.size
    }

    override fun getChildrenCount(p0: Int): Int {
        return map[titleList[p0]]!!.size
    }

    override fun getGroup(p0: Int): String {
        return titleList[p0]
    }

    override fun getChild(p0: Int, p1: Int): String {
        return map[titleList[p0]]!![p1]
    }

    override fun getGroupId(p0: Int): Long {
        return 0
    }

    override fun getChildId(p0: Int, p1: Int): Long {
        return 0
    }

    override fun hasStableIds(): Boolean {
        return false
    }
    override fun isChildSelectable(p0: Int, p1: Int): Boolean {
        return true
    }


    override fun getGroupView(p0: Int, p1: Boolean, p2: View?, p3: ViewGroup?): View {
        TODO("Not yet implemented")
    }

    override fun getChildView(p0: Int, p1: Int, p2: Boolean, p3: View?, p4: ViewGroup?): View {
        TODO("Not yet implemented")
    }



}