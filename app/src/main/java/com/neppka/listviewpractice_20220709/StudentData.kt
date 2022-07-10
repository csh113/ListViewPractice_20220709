package com.neppka.listviewpractice_20220709

class StudentData (
    val name : String,
    val birthYear : Int,
    val address : String,
        ) {

//    나이 구하는 로직 - 함수로 처리
    fun getKoreanAge () : Int {
        val koreanAge = 2022 - birthYear + 1
        return koreanAge
    }
}