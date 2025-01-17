/*Paulo Papo-de-Pescador, homem de bem, comprou um microcomputador 
para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um 
peso de peixes maior que o estabelecido pelo regulamento de pesca do 
estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo 
excedente. Paulo precisa que você faça um programa que leia a variável peso 
(peso de peixes) e calcule o excesso. Gravar na variável excesso a 
quantidade de quilos além do limite e na variável multa o valor da multa que 
Paulo deverá pagar. Imprima os dados do programa com as mensagens 
adequadas.
*/

fun main(){
    val peso: Double
    val excesso: Double
    val multa: Double
    
    println(" Informe a quantidade de quilos de peixes pescados")
    peso = readLine()!!.toDouble()
    
    if (peso<=50){
        println("Não será necessário o pagamento de multa para esta quantidade!")
    } else {
        excesso = peso - 50
        multa = excesso * 4
        println("Sua multa é de: R$ %.2f".format(multa))
    }
}