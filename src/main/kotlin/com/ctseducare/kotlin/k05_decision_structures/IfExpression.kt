package com.ctseducare.kotlin.k05_decision_structures

fun main() {

    var a = 10
    var b = 5

    var max = if (a > b) a else b
    println(max)

    a = 3
    b = 5
    max = if (a > b) {
        println("a é maior que b")
        a
    } else {
        println("b é maior que a")
        b
    }
    println(max)

}