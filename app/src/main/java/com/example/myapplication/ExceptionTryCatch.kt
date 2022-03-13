package com.example.myapplication

import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.NullPointerException
import kotlin.coroutines.suspendCoroutine

//fun main(){
//    val str = getNumber("10")
//    println(str)
//}
//
//fun getNumber(str:String):Int{
//
//    return try{
//        Integer.parseInt(str)
//
//    }catch (e:ArithmeticException){
//        0
//    }
//}



//fun main(){
//    val str = getNumber("10.5")
//    println(str)
//
//}
//
//fun getNumber(str:String):Int{
//
//    return try{
//        Integer.parseInt(str)
//
//    }catch (e:ArithmeticException){
//        0
//    }
//}


//multiple catch Block
//fun main(args:Array<String>){
//
//    try{
//        val a = IntArray(5)
//        a[5] = 10/0
//    }catch (e:ArithmeticException){
//        println("arithmeticException catch")
//    }catch (e:ArrayIndexOutOfBoundsException){
//        println("array index outofbounds exception")
//    }catch (e: Exception){
//        println("parent exception class")
//    }
//    println("code after try catch")
//}




////Nested try catch
//try{
//
//    try{
//
//    }catch (e:Exception)
//
//}


//finally block

fun main(args:Array<String>){
    try{
        val data = 10/5
        println(data)
    }catch (e:NullPointerException){
        println(e)
    }finally {
        println("finally block always executes")
    }
    println("below code...")
}