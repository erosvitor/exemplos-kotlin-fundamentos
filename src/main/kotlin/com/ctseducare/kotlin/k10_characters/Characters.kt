package com.ctseducare.kotlin.k10_characters

fun main() {

    // Criando uma variável do tipo caractere vazia
    val letra: Char

    // Atribuindo um dado para a variável
    letra = 'K'

    // Exibindo o conteúdo da variável
    println(letra)

    // Criando uma variável do tipo caractere com conteúdo
    val c = 'F'

    // Identificando o tipo do caractere
    println("O caractere $c")
    if (c.isLetterOrDigit())
        println("  É um número ou uma letra")

    if (c.isLetter())
        println("  É uma letra")

    if (c.isLowerCase())
        println("  É uma letra minúscula")

    if (c.isUpperCase())
        println("  É uma letra maiúscula")

    if (c.isDigit())
        println("  É um número")

    if (c.isWhitespace())
        println("  É um caractere de espaço")

}