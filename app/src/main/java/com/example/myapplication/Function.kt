package com.example.myapplication

fun main(){

    val result: Double = avg(3.2, 1.8)

    myFunction()
    println(addUp(1, 2))
    println(result)

}

fun myFunction(){
    println("my Function")
}

//매개변수 : input
fun addUp(a: Int, b: Int): Int{

    //output
    return a + b
}

fun avg(a: Double, b: Double): Double{

    return (a+b)/2

}