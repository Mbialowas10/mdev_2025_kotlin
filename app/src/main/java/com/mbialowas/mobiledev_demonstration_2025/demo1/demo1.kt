package com.mbialowas.mobiledev_demonstration_2025.demo1

fun main() {

    // single line comment

    /*
     *  multi line comment
     */

    println("Hello World!")
    print("Hello Class!")

    // variable usage
    // val is readonly variable
    val dob = "xxxx-Aug-5"
    // var is mutable variabledob = "xxxx-Aug-6" // will not work because val is readonly

    // kotlin deal with inferred types meanning you don't have to declare datatype ie.
    // it can be inferred by assigmnet
    val name:String = "Michael bialowas"

    val PI = 3.14159

    // var is treated like a normal variable
    var changingValue = 1
    changingValue = 2
    changingValue = 3
    println(changingValue)
    println(changingValue.javaClass)


}