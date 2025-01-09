package com.mbialowas.mobiledev_demonstration_2025.demo1.oop

open class Animal(
    var type: String,
    var sound: String
) {
    fun makeSound() {
        println("$type makes a $sound sound.")
    }

}