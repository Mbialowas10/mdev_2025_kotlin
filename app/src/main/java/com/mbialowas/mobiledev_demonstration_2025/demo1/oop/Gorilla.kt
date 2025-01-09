package com.mbialowas.mobiledev_demonstration_2025.demo1.oop

class Gorilla(type: String, sound:String) : Animal(type, sound) {
    init {
        println("Gorilla created")
    }
    fun eatBananas() {
        println("Gorilla is eating bananas")
    }
//    fun makeSound(sound: String) {
//        println("$type makes a $sound sound.")
//    }

}