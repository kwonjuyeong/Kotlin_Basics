package com.example.myapplication

fun main(){
//    val arrayList = ArrayList<String>()
//    //ArrayList에 add함수로 아이템 추가
//    arrayList.add("One")
//    arrayList.add("Two")
//    println("print ArrayList")
//    for(i in arrayList){
//        println(i)
//    }

//    //5개의 값만 입력하도록 제한
//    val arrayList:ArrayList<String> = ArrayList<String>(5)
//    //String타입의 Mutable리스트
//    var list:MutableList<String> = mutableListOf<String>()
//    list.add("One")
//    list.add("Two")
//    arrayList.addAll(list)
//    val itr = arrayList.iterator()
//
//    while (itr.hasNext()){
//        println(itr.next())
//    }
//    println("size of arrayList ${arrayList.size}")


//get함수 사용
    val arrayList:ArrayList<String> = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
//    for(i in arrayList){
//        println(i)
//    }
    //인덱스 값 1의 위치는 "Two"를 가르킨다.
    println(arrayList.get(1))
}