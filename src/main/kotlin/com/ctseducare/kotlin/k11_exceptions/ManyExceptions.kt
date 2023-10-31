package com.ctseducare.kotlin.k11_exceptions

fun main() {

    val n1 = "10"
    val n2 = 0

    try {
        var resultado = n1.toInt() / n2
    } catch (e: NumberFormatException) {
        println("Número inválido")
    } catch (e: ArithmeticException) {
        println("Divisor não pode ser zero")
    }

}