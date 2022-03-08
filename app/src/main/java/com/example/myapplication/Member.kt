package com.example.myapplication
//멤버 변수 - 기능과 생성자


fun main(){
    val person = Person2("Kwon", "Juyeong", 32)
    person.hobby = "Computer coding"
    person.age = 26
    person.stateHobby()
    println("Kwon age is ${person.age} years old")

}


class Person2(firstName: String = "default", lastName : String = "value"){

    //멤버 변수 age, hobby
    var age : Int ?= null
    var hobby : String ?= "watching Netflix"

    constructor(firstName: String, lastName: String, age:Int): this(firstName, lastName) {
        this.age = age
        println("Initial FirstName: $firstName, LastName: $lastName, age : $age")
    }

    fun stateHobby(){
        println("My hobby is $hobby")
    }

}