package com.mbialowas.mobiledev_demonstration_2025.demo1.oop

fun main() {
    var shark = Animal("Shark", "Chomping")
    var monkey = Animal("Monkey", "squealing")

    println(shark.makeSound())
    println(monkey.makeSound())

    val bird = Bird("Sparrow", "Chirp")
    bird.makeSound()
    bird.fly()

    val gorilla = Gorilla("Gorilla", "Growling")
    gorilla.eatBananas()
    gorilla.makeSound()
}


