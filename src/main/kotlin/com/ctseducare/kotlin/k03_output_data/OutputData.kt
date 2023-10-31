package com.ctseducare.kotlin.k03_output_data

fun main() {

    // Mostrando um texto fixo
    println("Comandos Saida de Dados")

    // Mostrando o conteúdo de uma variável
    val PI = 3.14159265
    println(PI)

    // Mesclando texto fixo com conteúdo de variável
    println("O valor da constante PI é $PI")

    // Mostrando dados sem pular linha
    print("Observe que")
    print(" tudo será ")
    print("mostrado na mesma linha")
    print("\n")

    // Formatando a saída dos dados
    val linguagem = "Kotlin"
    val anoLancamento = 2016
    println("A linguagem %s foi lançada em %d".format(linguagem, anoLancamento))

}
