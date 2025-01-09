package com.mbialowas.mobiledev_demonstration_2025.demo1.oop

class Bird(type: String, sound:String) : Animal(type, sound) {

    init{
        println("Bird created")
    }
    fun fly(){
        println("$type flies")

    }
//    fun makeSound(sound: String) {
//        println("$type makes a $sound sound.")
//    }
}