package com.ctseducare.kotlin.k05_decision_structures

fun main() {

    // Avaliando apenas o resultado positivo
    // ----------------------------------------------------------------------------------------------------
    val idade1 = 18
    if (idade1 >= 18) {
        println("Maior de idade")
    }

    // Avaliando o resultado positivo e negativo
    // ----------------------------------------------------------------------------------------------------
    val idade2 = 17
    if (idade2 >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }

    // Avaliando mais de uma situação
    // ----------------------------------------------------------------------------------------------------
    val idade3 = 15
    if (idade3 >= 18) {
        println("Maior de idade")
    } else if (idade3 >= 16) {
        println("Menor de idade e pode votar")
    } else {
        println("Menor de idade e não pode votar")
    }

}
