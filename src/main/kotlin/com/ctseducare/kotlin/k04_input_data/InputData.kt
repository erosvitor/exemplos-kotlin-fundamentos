package com.ctseducare.kotlin.k04_input_data

import java.util.Scanner

fun main() {

    val read = Scanner(System.`in`)

    // Recebendo um texto
    // --------------------------------------------------------------------------------
    println("Qual é o seu nome?")
    val nome = read.nextLine()
    println("Olá $nome")

    // Recebendo um número inteiro
    // --------------------------------------------------------------------------------
    println("Qual é a sua idade?")
    val idade = read.nextInt()
    println("Você tem $idade anos")

    // Recebendo um número decimal
    // --------------------------------------------------------------------------------
    println("Qual é a sua altura?")
    val altura = read.nextFloat()
    println("Sua altura é $altura")

}