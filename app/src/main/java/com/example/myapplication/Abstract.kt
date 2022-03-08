package com.example.myapplication

abstract class Mammal(private val name: String, private val origin: String, private val weight:Double){

        //추상 프로퍼티 - 꼭 서브 클래스가 오버라이딩을 해야한다.
        abstract var maxSpeed : Double

        //추상 메소드 - 바디가 없이 만들 수 있다.
        abstract fun run()
        abstract fun breath()

        fun displayDetail(){
            println("Name: $name, Origin: $origin, Weight: $weight, MaxSpeed: $maxSpeed")
        }
}

//Mammal 추상 클래스를 오버라이딩 해준다, 프로퍼티, 메소드 등도 오버라이딩으로 불러온다.
class Human(name: String, origin: String, weight: Double, override var maxSpeed:Double):Mammal(name, origin, weight){

    override fun run(){
        println("Run on two legs")
    }

    override fun breath() {
        println("Breath through nose")
    }
}

class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight){

    override fun run(){
        println("Run on four legs")
    }

    override fun breath() {
        println("Breath through nose")
    }
}


fun main(){

    val human = Human("Kwon", "Korea", 65.0,28.0)
    val elephant = Elephant("Booo", "Africa", 6200.0, 34.0)

    //val mammal = Mammal("mamaaaal", "India", 8000.0, 60.0)


    human.run()
    elephant.run()

    human.breath()
    elephant.breath()

}