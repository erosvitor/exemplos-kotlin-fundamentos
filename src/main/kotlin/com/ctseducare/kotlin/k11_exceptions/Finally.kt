package com.ctseducare.kotlin.k11_exceptions

fun main() {

    val salarioStr = "aa"

    try {
        val salario = salarioStr.toFloat()
    } catch (e: NumberFormatException) {
        println("Valor inválido")
    } finally {
        println("Este comando sempre será executado")
    }

}