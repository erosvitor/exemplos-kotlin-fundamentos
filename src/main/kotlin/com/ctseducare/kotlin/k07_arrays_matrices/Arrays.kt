package com.ctseducare.kotlin.k07_arrays_matrices

fun main() {

    // Criando um vetor vazio para armazenar números inteiros
    val numeros = Array(5) { 0 }

    // Armazenando números inteiros no vetor
    numeros[0] = 0
    numeros[1] = 1
    numeros[2] = 2
    numeros[3] = 3
    numeros[4] = 5

    // Exibindo o conteúdo do vetor
    for (n in 0..numeros.size) {
        println(n)
    }

    // Criando um vetor com conteúdo
    val pares = arrayOf(0, 2, 4, 6, 8)

    // Mostrando os dados contidos no vetor
    for (i in 0..pares.size-1) {
        println(pares[i])
    }

    // Criando um vetor vazio para armazenar textos
    val frutas = Array(5) { "" }

    // Armazenando textos no vetor
    frutas[0] = "Uva"
    frutas[1] = "Maçã"
    frutas[2] = "Abacaxi"
    frutas[3] = "Manga"
    frutas[4] = "Banana"

    // Mostrando os dados contidos no vetor
    for (i in 0..pares.size-1) {
        println(pares[i])
    }

    // Outra maneira de percorrer o vetor
    for (fruta in frutas) {
        println(fruta)
    }

}
