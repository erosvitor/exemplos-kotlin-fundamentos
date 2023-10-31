package com.ctseducare.kotlin.k13_textfile

import java.io.File

fun main() {

    val file = File("dadoscurso.txt")
    file.bufferedWriter().use { buffer ->
        buffer.write("Linguagem Kotlin\n")
        buffer.write("45 horas\n")
        buffer.write("Noite\n")
    }

}