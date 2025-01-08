package com.mbialowas.mobiledev_demonstration_2025.oop

class Bird(name: String, sound:String) : Animal(name,sound){

   init{
       println("Bird $name is created")
   }
    override fun makeSound():String{
        return "$type says $sound"

    }
}