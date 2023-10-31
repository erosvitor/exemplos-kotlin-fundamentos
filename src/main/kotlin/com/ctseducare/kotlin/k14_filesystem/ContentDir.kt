package com.ctseducare.kotlin.k14_filesystem

import java.nio.file.DirectoryStream
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

fun main() {

    val diretorioAtual = Paths.get("").toAbsolutePath()
    val conteudoDiretorio:DirectoryStream<Path> = Files.newDirectoryStream(diretorioAtual)
    for (item in conteudoDiretorio) {
        println(item)
    }

}