package com.ctseducare.kotlin.k11_exceptions

fun main() {

    var n1 = "aa"
    var n2 = 0

    try {
        var resultado = Integer.parseInt(n1) / n2
    } catch (e: NumberFormatException) {
        println("Número inválido")
    }

}
