/* vetor
var vetor = arrayOf<Tipo>(valores)
var vetor = arrayOfNulls<Tipo>(tamanho)
var listaNumeros = IntArray(tamanho)

estrutura de repetição
for (numero: Int in 0..10){
println(numero)
}
for (i: Int in listaNomes.indices){
println(listaNomes[i])
}
listaNomes.forEach {nome -> println(nome)}

Exemplo percorrendo um array usando for com manipulação de indices
for (i: Int in listaNomes.indices) {
    println("O nome na posição $i é ${listaNomes[i]}")
} */

/*Exercícios de revisão - Aula Kotlin Básico

1. Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma
dos números que não são múltiplos de 13 entre X e Y, incluindo
ambos. */
//pedir 2 valores inteiros X Y
//achar o intervalo de x a y
//ver se se os numeros são multiplos de 13
//fazer a soma dos numeros no intervalo

fun main(){
    println("Insira 2 números inteiros")
    val X = readln().toInt()
    val Y = readln().toInt()
    somaIntervalo(X, Y)
}

fun somaIntervalo(X:Int, Y: Int): Int{
    var soma = 0
    for (intervalo in X..Y){
        if (intervalo % 13 != 0){
        soma+= intervalo
        }
    }
    return soma
}


/*
fun pedirNumeros(): IntArray {
//    val numerosDigitados = IntArray(2){ readln().toInt() }
//    return numerosDigitados
    return
}
*/

//fun exibirSoma(soma: Int){
//    println(soma)
//}