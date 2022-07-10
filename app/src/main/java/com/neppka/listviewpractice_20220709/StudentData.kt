package com.neppka.listviewpractice_20220709

import java.io.Serializable

class StudentData (
    val name : String,
    val birthYear : Int,
    val address : String,
        ) : Serializable {

//    나이 구하는 로직 - 함수로 처리
    fun getKoreanAge () : Int {
        val koreanAge = 2022 - birthYear + 1
        return koreanAge
    }
}