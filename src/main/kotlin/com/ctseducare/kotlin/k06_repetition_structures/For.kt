package com.ctseducare.kotlin.k06_repetition_structures

fun main() {

    println("Imprimindo os 10 primeiros números inteiros naturais")
    for (n in 0..9) {
        println(n)
    }

    println("Imprimindo os 10 primeiros números inteiros naturais de três em três")
    for (n in 0..9 step 3) {
        println(n)
    }

}