package com.ctseducare.kotlin.k12_datetime

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {

    // Exibindo a data e hora atual
    val data1 = LocalDateTime.now()
    println(data1)

    // Formatando a data e hora atual
    val data2 = LocalDateTime.now()
    println(data2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")))

    // Criando uma data específica
    val data3Str = "01/01/1995 12:30:00"
    val data3 = LocalDate.parse(data3Str, DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"))
    println(data3)

    // Manipulando uma data
    var data4 = LocalDateTime.now()
    data4 = data4.plusDays(3)
    println(data4)
    data4 = data4.plusMonths(2)
    println(data4)

    // Extraindo dados de uma data
    val data5 = LocalDateTime.now()
    val diaDaSemana = data5.dayOfWeek.value
    val diaDoMes = data5.dayOfMonth
    val mes = data5.monthValue
    val ano = data5.year
    println("Dia da semana: %d, dia: %d, mês: %d, ano: %d".format(diaDaSemana, diaDoMes, mes, ano))

}
