package com.example.myapplication

fun main(){

    //val numbers:IntArray = intArrayOf(1,2,3,4,5,6,7)
    //val numbers = intArrayOf(1,2,3,4,5,6,7).
    //println(numbers.contentToString())
    val numbers = arrayOf(1,8,3,4,5,6,7)

    print("initial values ${numbers.contentToString()}")

    numbers[0] = 6
    numbers[1] = 5
    numbers[2] = 9
    numbers[5] = 1
    print("\nchanged values ${numbers.contentToString()}")


    val days = arrayOf("Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat")
    print("\n" + days.contentToString())

    val fruit = arrayOf(Fruit("Apple", 2.5),Fruit("Grape", 3.5))
    print("\n"+ fruit.contentToString())

    val mix = arrayOf("Sun", "Mon", "Tues", 1,2,3 , Fruit("Apple", 2.5))
    print("\n" + mix.contentToString())


}

//데이터 클래스
data class Fruits(val name : String, val price:Double)