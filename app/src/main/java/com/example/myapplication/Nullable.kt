package com.example.myapplication

private val Nothing.length: Unit
    get() {}

fun main(){
    
    val nullableName : String ? = "Kwon"
    //nullableName = null
    
    //var len2 = nullableName?.length
    nullableName?.let { println(it.length) }


    val name = nullableName ?: "Guest"
    println("name is $name")

    print(nullableName!!.lowercase())
}