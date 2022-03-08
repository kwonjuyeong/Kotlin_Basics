package com.example.myapplication


open class Car(val name:String, val brand:String){
    open var range: Double = 0.0

    fun extentRange(amount:Double){
        if(amount > 0)
            range += amount
    }

    open fun drive(distance:Double){
        println("Drive for $distance KM")
    }
}

class ElectricCar(name: String, brand: String, batteryLife:Double): Car(name, brand){

    override var range = batteryLife *6
    override fun drive(distance: Double) {
        println("Drive for $distance KM")
    }
    fun drive(){
        println("Drive for $range KM on electricity")
    }
}

fun main(){

    val AudiA3 = Car("A3", "Audi")
    val Tesla = ElectricCar("S-model", "Tesla", 85.0)
    AudiA3.drive(200.0)
    Tesla.drive(190.0)

}