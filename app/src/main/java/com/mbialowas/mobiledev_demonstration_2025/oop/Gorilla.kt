package com.mbialowas.mobiledev_demonstration_2025.oop

class Gorilla(name: String, sound:String) : Animal(name,sound) {
    init{
        println("Gorilla $name is created")
    }
    override fun makeSound():String{
        return "$type says $sound"
    }
}