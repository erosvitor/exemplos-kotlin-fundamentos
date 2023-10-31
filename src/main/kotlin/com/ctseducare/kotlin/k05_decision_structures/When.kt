package com.ctseducare.kotlin.k05_decision_structures

fun main() {

    // Avaliando conteúdo de uma variável numérica
    // ----------------------------------------------------------------------------------------------------
    val itemCardapio = 2
    when (itemCardapio) {
        1 -> println("Escolheu o item 1")
        2 -> println("Escolheu o item 2")
        3 -> println("Escolheu o item 3")
        else -> println("Item inexistente")
    }

    // Avaliando conteúdo de uma variável String
    // ----------------------------------------------------------------------------------------------------
    val color = "blue"
    when (color) {
        "red" -> println("Vermelho")
        "green" -> println("Verde")
        "blue" -> println("Azul")
        else -> println("Cor inválida")
    }

    // Avaliando range de números
    // ----------------------------------------------------------------------------------------------------
    val number = 18
    when (number) {
        in 1..10 -> println("Esta entre 1 e 10")
        in 11..20 -> println("Esta entre 11 e 20")
        !in 21..30 -> println("Não esta entre 21 e 30")
        else -> println("inválido")
    }

}
