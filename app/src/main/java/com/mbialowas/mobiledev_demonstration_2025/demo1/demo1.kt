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

    /*
     Functions -
     */

    fun addNumbers(): Int{
        return 80+6
    }
    fun newAndImprovedAddNumbers(a: Int, b: Int): Int{
        return a + b
    }

    fun newAndImprovedAddNumbers2(a: Double, b: Double) = a + b

    //println(addNumbers())
    println(newAndImprovedAddNumbers(2, 3))
    println(newAndImprovedAddNumbers(10, 20))
    println(newAndImprovedAddNumbers2(2.0,5.6))

    println(newAndImprovedAddNumbers2(b=7.7,a=2.3))

    // Input list of grades
    val grades = listOf(2.0, 2.5, 3.0, 3.5, 4.0, 4.5)

    // Mapping numeric grades to letter grades
    val letterGrades = grades.map { grade ->
        when (grade) {
            2.0 -> "C"
            2.5 -> "C+"
            3.0 -> "B"
            3.5 -> "B+"
            4.0 -> "A"
            4.5 -> "A+"
            else -> "Unknown" // Handle unexpected values
        }
    }

    // Print the resulting letter grades
    println(letterGrades) // Output: [C, C+, B, B+, A, A+]

    // Example usage
    val result1 = sumNumbers(1, 3, 5)
    val result2 = sumNumbers(4, 5, 6, 7)

    println("Sum 1: $result1") // Output: Sum 1: 9
    println("Sum 2: $result2") // Output: Sum 2: 22

    val sub = {a:Int,b:Int -> a-b} // anonymous function
    hof(sub)

} // end main function


val addNumber = fun(a:Int, b:Int):Int{
    return a + b
}

fun sumNumbers(vararg numbers: Int): Int {
    return numbers.sum()
}



fun hof(subtraction: (Int,Int)-> Int){
    val result = subtraction(6,4) // this is a way to invoke function within hof function
    println(result)
}





