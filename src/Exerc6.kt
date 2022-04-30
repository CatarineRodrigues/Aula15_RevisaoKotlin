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
6. Crie um algoritmo, utilizando laços de repetição aninhados, que exiba
na tela a tabuada de multiplicação dos números de 1 a 9 */

// como é tabuada
// valor a * b = resultado
// a fixo
// b de 1 de 0 a 10
// b roda dentro do laço do a
// fazer um laço a (b de 0-10) termina a+1 (b de 0-10)

fun main(){
    tabuada()
}

fun tabuada(){
    var valorA = 1
    while (valorA < 10){
        println("\n-----Tabuada do $valorA-----")
        for (valorB in 0..10){
            var resultado = valorA * valorB
            println("$valorA x $valorB = $resultado")
        }
        valorA++
    }
}