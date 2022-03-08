package com.example.myapplication

fun main(){

    //while문
    var x = 1
    while(x <= 10){
        print("$x ")
        x++
    }
    println("while is done")

    //do while문
    var d = 15
    do{
        println("$d")
        d++
    }while(d<=10)

    //for문 예시
    for(num in 1..10){
        print("$num ")
    }
    println("")

    for(i in 1 until 10){
        print("$i ")
    }
    println("")

    for(i in 10 downTo 1){
        print("$i ")
    }
    println("")

    for(i in 10 downTo 1 step 2){
        print("$i ")
    }


    //break문
    for(i in 1 until 20){
        print("$i ")
        if(i/2 == 5){
            break
        }
    }
    println("Done")

    for (i in 1 until 20){
        if(i/2 == 5){
            continue
        }
        print("$i ")
    }
    print("Done")

}