package com.neppka.listviewpractice_20220709

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppka.listviewpractice_20220709.adapters.StudentListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    ArrayList 사용하기 위해 .. 전역 변수 = 멤버 변수
//    목록 공간 만들어주고
    val mStudentList = ArrayList<StudentData>()
//    어댑터 클래스 멤버변수화
    lateinit var mStudentListAdapter : StudentListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        학생 데이터 (더미 데이터 생성)
//        StudentData(~~~)라는 학생 데이터 객체들을 생성
//        ArrayList에 추가 (mStudentList.add)
        mStudentList.add(StudentData("최승희1", 1991, "서울시 성북구1"))
        mStudentList.add(StudentData("최승희2", 1992, "서울시 성북구2"))
        mStudentList.add(StudentData("최승희3", 1993, "서울시 성북구3"))
        mStudentList.add(StudentData("최승희4", 1994, "서울시 성북구4"))
        mStudentList.add(StudentData("최승희5", 1995, "서울시 성북구5"))
        mStudentList.add(StudentData("최승희6", 1996, "서울시 성북구6"))
        mStudentList.add(StudentData("최승희7", 1997, "서울시 성북구7"))
        mStudentList.add(StudentData("최승희8", 1998, "서울시 성북구8"))
        mStudentList.add(StudentData("최승희9", 1999, "서울시 성북구9"))
        mStudentList.add(StudentData("최승희10", 2000, "서울시 성북구10"))

//        실제 어댑터와 ArrayList를 연결(어댑터 클래스를 객체화)
        mStudentListAdapter = StudentListAdapter(this, R.layout.student_list_item, mStudentList)
//        액티비티 화면의 ListView 태그와 adapter를 연결
        mainListView.adapter = mStudentListAdapter
    }
}