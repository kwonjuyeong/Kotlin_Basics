package com.example.myapplication

fun main(args:Array<String>){

//    val obj: Any ?= "String unsafe cast"
//    val str: String? = obj as String?
//    println(str)

    val location:Any = "Kotlin"
    val safeString:String? = location as?String
    val safeInt:Int?= location as? Int
    println(safeString)
    println(safeInt)
}