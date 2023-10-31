package com.ctseducare.kotlin.k01_variables_datatypes

val tmp = sayHello()        // No error
//const val tmp = sayHello()  // Error

fun sayHello():String{
    return "Hello"
}

fun main() {

    println(tmp)

}
