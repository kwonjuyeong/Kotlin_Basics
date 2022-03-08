package com.example.myapplication

fun main(){
    val myCar = Carr()
    myCar.owner

    //maxSpeed는 0 이하가 들어갈 수 없음
    myCar.maxSpeed = 50
    println("Brand: ${myCar.myBrand}")
    println("MaxSpeed: ${myCar.maxSpeed}")
    println("Model: ${myCar.myModel}")
    //myCar.myModel = "M3"
}

class Carr(){

    lateinit var owner : String

    val myBrand : String = "BMW"

    get(){
        return field.lowercase()
    }

    var maxSpeed : Int = 0
        //get() = field
        set(value){

            field = if(value>0) value else throw  IllegalAccessException("Maxspeed cannot be less than 0")

        }

    var myModel: String = "M5"
        private set

    init {
        this.myModel = "M3"
        this.owner = "Kwon"
    }
}