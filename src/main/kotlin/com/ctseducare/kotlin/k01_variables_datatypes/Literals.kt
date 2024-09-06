package com.ctseducare.kotlin.k01_variables_datatypes

fun main() {

    var decimal = 123
    var long = 123L
    var binary = 0b1111011  // 123 em binário
    var hexa = 0x7B         // 123 em hexadecimal
    println(decimal)
    println(long)
    println(binary)
    println(hexa)

    var oneMillion = 1_000_000
    var creditCardNumber = 1234_5678_9012_3456L
    var hexBytes = 0xFF_EC_DE_5E
    var bytes = 0b11010010_01101001_10010100_10010010
    println(oneMillion)
    println(creditCardNumber)
    println(hexBytes)
    println(bytes)

}
