package com.mbialowas.mobiledev_demonstration_2025.demo1.oop

class Person{

    var name: String = "Michael Bialowas"

    //getter and setters
    get() = field   //getter
    set(value) {
        field = value
    } //setter

    var age: Int = 25
        get() = field
        set(value) {field = value}

}

fun main() {
    var mike = Person()
    println(mike.name)
    println(mike.age)
    mike.name = "Mike"
    mike.age = 40
    println(mike.name)
    println(mike.age)

}