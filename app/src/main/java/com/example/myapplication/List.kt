package com.example.myapplication

fun main(){


    val months = listOf("January", "February", "March")
    //listOf는 아무 타입이나 사용할 수 있다.
    //val anyTypes = listOf(1,2,3,true,false,"String")

    //Mutable로 바궈준다.
    val addMonths = months.toMutableList()
    //추가 할 월 아이템을 하나의 새로운 리스트에 넣어준다.
    val newMonth = arrayOf("April", "May", "June")
    //기존 리스트에 추가한다.
    addMonths.addAll(newMonth)
    addMonths.add("July")
    print(addMonths)

    //Mutable list of를 사용하면 특정한 타입의 뮤터블 리스트를 생성할 수 있다.
    val days = mutableListOf<String>("Mon", "Tues", "Wed")
    //String타입의 뮤터블 리스트에 아이템 추가
    days.add("Thu")
    //특정 인덱스의 값을 바꿀 수 있다.
    days[2] = "Sunday"
    //removeAt을 사용하면 인덱스 주소에 있는 값을 지울 수 있다.
    days.removeAt(3)
    print("\n"+days)


}