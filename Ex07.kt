/*FaÃ§a um Programa que pergunte quanto vocÃª ganha por hora e o nÃºmero de 
horas trabalhadas no mÃªs. Calcule e mostre o total do seu salÃ¡rio no referido 
mÃªs.*/

import java.text.DecimalFormat

fun main (){
    val ganho_hora: Double
    val hora_mes: Double
    val salario: Double
    val salario_formatado = DecimalFormat("#,###,###.00") //Formato do salário com 2 decimais
    
    println("Informe quanto você ganha por hora: ")
    ganho_hora = readLine()!!.toDouble()
    
    println("Informe quantas horas você trabalhou no mes: ")
    hora_mes = readLine()!!.toDouble()
    
    salario = ganho_hora * hora_mes
    
    val salario_exibido = salario_formatado.format(salario)

    println("Seu salário e: R$ $salario_exibido")
}
