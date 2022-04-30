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
3. Escreva um algoritmo que simule o funcionamento de um caixa de
supermercado. O seu algoritmo deve receber da pessoa usuária a
informação de quantos produtos o cliente comprou e, para cada
produto, deverá ler o seu preço. Ao final, deverá informar quanto o
cliente deve pagar pelas compras */

fun main() {
    val qnt = readln().toInt()
    leituraPrecoProtutos(qnt)
}

fun leituraPrecoProtutos(qnt: Int): FloatArray {
    var listaCompras = FloatArray(qnt)
    return listaCompras
}

fun calculoCompras(): Float {
    return 0f
}