package com.ctseducare.kotlin.k14_filesystem

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths

fun main() {

    try {
        val diretorioAtual = Paths.get("").toAbsolutePath().toString()
        val novoDiretorio = Paths.get(diretorioAtual + "/novo_diretorio")
        Files.createDirectory(novoDiretorio)

        val novosDiretorios = Paths.get(diretorioAtual + "/docs/financeiro")
        Files.createDirectories(novosDiretorios)

        val deleteDiretorio = Paths.get(diretorioAtual+ "/docs/financeiro")
        Files.delete(deleteDiretorio)
    } catch (e: IOException) {
        println("Failed to create directory! $e.getMessage()")
    }

}