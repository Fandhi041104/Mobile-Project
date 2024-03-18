package com.example.mobileproject

class Aquarium2_1 {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    fun printSize() {
        println("Width: $width cm" + "Length: $length cm" + "Height: $height cm")
    }
}

class Aquarium2_2 (var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    init {
        println("aquarium initializing")
        println("Volume: ${width * length * height / 1000} liters")
    }

    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    fun printSize() {
        println("Width: $width cm" + "Length: $length cm" + "Height: $height cm")

    println("Volume: $volume liters")
    }
}

fun buildAquarium2_1() {
    val myAquarium = Aquarium2_1()
        myAquarium.printSize()
        myAquarium.height = 60
        myAquarium.printSize()
}

fun buildAquarium2_2() {
    val aquarium1 = Aquarium2_2()
    aquarium1.printSize()

    val aquarium2 = Aquarium2_2(numberOfFish = 29)
    aquarium2.printSize()

    aquarium2.volume = 70
    aquarium2.printSize()
}

fun main() {
    buildAquarium2_1()
    buildAquarium2_2()
}






