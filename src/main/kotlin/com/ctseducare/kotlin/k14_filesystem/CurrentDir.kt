package com.ctseducare.kotlin.k14_filesystem

import java.nio.file.Paths

fun main() {

    val diretorioAtual = Paths.get("").toAbsolutePath().toString()
    println(diretorioAtual)

}