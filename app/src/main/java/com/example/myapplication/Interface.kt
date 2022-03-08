package com.example.myapplication

interface Drivable{
    val maxSpeed:Double
    fun drive():String
    fun brake(){
        println("The drivable is braking")
    }
}


open class Car2(override  val maxSpeed:Double, val name:String, val brand:String) :Drivable{

    open var range:Double = 0.0

    fun extentRange(amount:Double){
        if(amount > 0)
            range += amount
    }

    override  fun drive():String {
        return "Driving the interface drive"
    }

    open fun drive(distance:Double){
        println("Drive for $distance Km")
    }
}

class ElectricCar2(maxSpeed: Double, name: String, brand: String, batteryLife:Double):Car2(maxSpeed, name, brand){


    override var range = batteryLife *6
    override fun drive(distance: Double) {
        println("Drive for $distance Km")
    }
    override fun drive():String{
        return "Drive for $range Km on electricity"
    }

    override fun brake() {
        super.brake()
        println("brake inside of electric car")
    }

}

fun main(){
    val audia3 = Car2(200.0, "A3", "Audi")
    val tesla = ElectricCar2(240.0, "S-model", "Tesla", 85.0)
    // tesla.extentRange(200.0)
    //tesla.drive()
    tesla.brake()
    audia3.brake()
    //audia3.drive(240.0)
    //tesla.drive(200.0)

}