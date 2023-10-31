package com.ctseducare.kotlin.k09_strings

fun main() {

    // Declarando uma string
    var str1: String

    // Preenchendo uma string
    str1 = "Linguagem Kotlin"

    // Obtendo o tamanho da string
    val tamanho = str1.length
    println(tamanho)

    // Obtendo uma substring
    val substring = str1.substring(0, 5)
    println(substring)

    // Substituindo uma substring por outra substring
    str1 = str1.replace("Kotlin", "KOTLIN")
    println(str1)

    // Substituindo todas substring por outra substring
    var str2 = "red;green;blue"
    str2 = str2.replace(";", ",")
    println(str2)

    // Removendo substring
    var str3 = "81200-200"
    str3 = str3.replace("-", "")
    println(str3)

    // Comparando strings
    val str4 = "Kotlin"
    val str5 = "Javascript"
    if (str4 == str5) {
        println("São iguais")
    } else {
        println("Não são iguais")
    }

    // Verificando se a string é vazia
    val str6 = ""
    if (str6.isEmpty()) {
        println("É vazia")
    } else {
        println("Não é vazia")
    }

    // Verificando se uma string esta em branco
    val str7 = " "
    if (str7.isBlank()) {
        println("Esta em branco")
    } else {
        println("Não está em branco")
    }

    // Removendo espaços em branco
    var str8 = " Kotlin "
    str8 = str8.trim()
    println(str8)

    // Quebrando uma string
    val str9 = "banana,abacate,abacaxi"
    val frutas = str9.split(",")
    println(frutas[0])
    println(frutas[1])
    println(frutas[2])

}
