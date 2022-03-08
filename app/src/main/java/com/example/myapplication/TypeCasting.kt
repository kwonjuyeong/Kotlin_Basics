package com.example.myapplication

import kotlin.math.floor

fun main(){

//    val stringList: List<String> = listOf("Juyeong", "Micheal", "Lucid")
//    val mixedTypeList:List<Any> = listOf("Juyeong", 10, 17, "BDay", 66.5, "weights", "kg")
//
//    for(value in mixedTypeList){
//        if(value is Int){
//            println("Integer: '$value'")
//        }else if(value is Double){
//            println("Double: '$value' with Floor value ${floor(value)}")
//        }else if (value is String){
//            println("String: '$value' of length ${value.length}")
//        }else{
//            println("Unknown Type")
//        }
//    }
    //when으로 작성
    /*
    for (value in mixedTypeList){
        when(value){
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value with Floor value ${floor(value)}")
            is String -> println("String: '$value of ${value.length}" )
            else -> println("Unknown Type")
        }
    }*/

/*
    //Smart Cast
    val obj1:Any = "I have a dream"
    //!is : obj1은 String이 아니다
    if(obj1 !is String){
        println("Not a String")
    }else{
        println("Found a String of length ${obj1.length}")
    }
    val str1: String = obj1 as String
    println(str1.length)
*/

    //Int형을 String으로 변환
/*
    //unsafe변환 : as키워드 사용- 에러 발생
    val obj2: Any = 1337
    val str2: String = obj2 as String
    println(str2)*/

    //safe변환 : "as?"키워드 사용.
    val obj3: Any = 1337
    val str3: String? = obj3 as? String
    println(str3) //null
}
