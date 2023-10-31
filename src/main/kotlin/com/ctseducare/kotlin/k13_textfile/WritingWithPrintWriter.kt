package com.ctseducare.kotlin.k13_textfile

import java.io.File

fun main() {

    val file = File("dadoscurso.txt")
    file.printWriter().use { buffer ->
        buffer.println("Linguagem Kotlin")
        buffer.println("45 horas")
        buffer.println("Noite")
    }

}