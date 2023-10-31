package com.ctseducare.kotlin.k08_matrices

fun main() {

    // Criando uma matriz 2x2 para armazenar números inteiros
    val numeros = arrayOf(Array(2) { 0 }, Array(2) { 0 })

    // Armazenando números inteiros na matriz
    numeros[0][0] = 1
    numeros[0][1] = 1
    numeros[1][0] = 2
    numeros[1][0] = 3

    // Criando uma matriz 2x4 com números inteiros
    val coordenadas = arrayOf(intArrayOf(2, 2), intArrayOf(2, 8), intArrayOf(5, 2), intArrayOf(3, 2))

    // Mostrando os dados contidos na matriz
    for (i in coordenadas.indices) {
        for (j in coordenadas[i].indices) {
            print(coordenadas[i][j])
        }
        println("")
    }

}