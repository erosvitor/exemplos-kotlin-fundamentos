package com.ctseducare.kotlin.k07_arrays

fun main() {

    var marcasVeiculos = arrayOf("Fiat", "Mercedes", "Ford", "BMW")

    // Obter quantidade de elementos
    println(marcasVeiculos.size)

    // Verificar se um determinado item existe no vetor
    println(marcasVeiculos.contains("Chevrolet"))

    // Adicionar item no final do vetor
    marcasVeiculos = marcasVeiculos.plus("Chevrolet")
    println(marcasVeiculos.contentToString())

    // Ordenar o vetor em ordem ascendente
    marcasVeiculos.sort()
    println(marcasVeiculos.contentToString())

    // Ordenar o vetor em ordem descendente
    marcasVeiculos.reverse()
    println(marcasVeiculos.contentToString())

    // Pegar o último elemento do vetor
    val ultimoElemento = marcasVeiculos.last()
    println(ultimoElemento)
    println(marcasVeiculos.contentToString())

    // Embaralhar conteúdo do vetor
    marcasVeiculos.shuffle()
    println(marcasVeiculos.contentToString())

}
