package com.example.myapplication

fun main(){

    var fruit = setOf("Orange", "Apple", "Watermelon", "Grape", "Mango", "Orange", "Watermelon")
//    println(fruit.size)
//    println(fruit.toHashSet())
//    println(fruit.toSortedSet())

    val newFruits = fruit.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    newFruits.add("Pear")
    //print(newFruits)


    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    //Map에서 2는 인덱스가 아니라 키 값이다.
    //print(daysOfTheWeek[2])

    for(key in daysOfTheWeek.keys){
        println("key $key value is ${daysOfTheWeek[key]}")
    }

    //key값이 정수형, String형이 들어가도 되고, 값 또한 마찬가지다.
    val fruitsMap = mapOf("Favorite" to Fruit("Grape", 2.5), "Ok" to Fruit("Apple", 1.0))
    //Mutable로 Map을 수정 가능하게 만들어준다.
    val newDayOfweek = daysOfTheWeek.toMutableMap()
    //key 4, 5에 목, 금요일을 넣어줘 월~금까지 나타낸다.
    newDayOfweek[4] = "Thursday"
    newDayOfweek[5] = "Friday"
    //toSortedMap을 통해 Map 안에 있는 값을 정렬해준다.
    print(newDayOfweek.toSortedMap())
}

data class Fruit(val name: String, val price:Double)