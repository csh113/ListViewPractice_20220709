package com.neppka.listviewpractice_20220709.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppka.listviewpractice_20220709.R
import com.neppka.listviewpractice_20220709.StudentData
import org.w3c.dom.Text
import java.util.*
import kotlin.collections.ArrayList

class StudentListAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<StudentData>
) : ArrayAdapter<StudentData>(mContext, resId, mList) {
//    한칸의 xml에 나타날 모양을 커스터마이징
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, null)
        }
        val row = tempRow!!

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val ageTxt = row.findViewById<TextView>(R.id.ageTxt)
        val addressTxt = row.findViewById<TextView>(R.id.addressTxt)

//        mList[position] => mList의 position번째 있는 StudentData
        nameTxt.text = mList[position].name

//        도전과제 => String을 가공하여 ${} 를 활용해서 => 나이부분의 값이 (~~세)로 표시되도록 가공
        val calendar = Calendar.getInstance()

        var birthYearVal = calendar.get(Calendar.YEAR) - mList[position].birthYear  + 1

//        ageTxt.text = "${birthYearVal} 세"
        ageTxt.text = "(${mList[position].getKoreanAge()} 세)"
        addressTxt.text = mList[position].address

//        오후 수업 시작 - event 추가
//        row.setOnClickListener() MainActivity에서 한다.
        return row
    }

}