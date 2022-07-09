package com.neppka.listviewpractice_20220709.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppka.listviewpractice_20220709.StudentData

class StudentListAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<StudentData>
) : ArrayAdapter<StudentData>(mContext, resId, mList) {

}