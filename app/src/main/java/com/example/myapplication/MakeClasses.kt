package com.example.myapplication

fun main(){

    var person = Person("Kwon", "Juyeong")
    var default = Person()
    var juju = Person(lastName = "juju")

}


class Person(firstName: String = "기본", lastName: String = "값"){
    init {
        println("Person created")
        println("Initial Firstname = $firstName Lastname = $lastName")
    }

}