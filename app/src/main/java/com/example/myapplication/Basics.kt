package com.example.myapplication

fun main(){

    //val var 차이점
    var myName = "Kwon"
    myName = "Juyeong"
    println("Hello" + myName)

    //한줄 주석
    /* 여러줄
    주석
    입니다.*/
    //TODO: 해야할 일 주석



    val myStr = "Hello Kwon"
    var firstCharInstr = myStr[0]
    var lastCharInstr = myStr[myStr.length -1]

    println("First Character " + firstCharInstr + " myStr의 길이 " + myStr.length)
    println("Second Character $firstCharInstr myStr의 길이 ${myStr.length}")



    //산술 연산자
    var result = 5+3

    val a = 5.0
    val b = 3

    var resultDouble: Double = a/b
    println(resultDouble)



    //비교 연산자(==, !=, <, >, <=, >=)

    //대입 연산자(+=, -=, *=, /=, %=)

    //증감 연산자(++, --)
    var myNum = 31
    myNum++
    println("myNum is $myNum")


}