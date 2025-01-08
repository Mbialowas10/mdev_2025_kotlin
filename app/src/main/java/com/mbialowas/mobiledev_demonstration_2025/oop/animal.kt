package com.mbialowas.mobiledev_demonstration_2025.oop

/*
    Blue print for an animal class
 */
open class Animal(
    var type: String,
    var sound: String
){
    open fun makeSound():String{
        return "$type says $sound"
    }

}