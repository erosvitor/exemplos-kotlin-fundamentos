package com.ctseducare.kotlin.k11_exceptions

fun main() {

    val numeroStr = "aa"
    try {
        val numero = numeroStr.toInt()
    } catch (e: Exception) {
        println("Número inválido")
    }

}
