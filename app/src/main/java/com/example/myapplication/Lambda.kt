package com.example.myapplication

//fun main(){
//    addNumber(5,10)
//}
//fun addNumber(a:Int, b: Int){
//    val add = a+b
//    println(add)
//}


fun main(){

    //val sum:(Int, Int) -> Int = {a:Int, b:Int -> a+b}
    //println(sum(10, 5))
    val sum = {a:Int, b:Int -> println(a+b)}
    sum(10,5)
}
