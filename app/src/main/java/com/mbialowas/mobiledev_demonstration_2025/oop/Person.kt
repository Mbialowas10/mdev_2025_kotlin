package com.mbialowas.mobiledev_demonstration_2025.oop

class Person{
    var name: String = "Michael Bialowas"

    // work with getter and setters
    get() = field // getter

    set(value){
        field = value // setter
    }

    var age: Int = 25
    get() = field   // getter
    set(value){
        field = value // setter
    }
}

fun main() {
    val mike = Person()
    println(mike.name + " " + mike.age)

    mike.name = "Mike"
    mike.age = 26
    println(mike.name + " " + mike.age)

}