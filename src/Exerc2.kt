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
2. Leia um valor e faça um programa que coloque o valor lido na
primeira posição de um vetor de tamanho 10. Em cada posição
subsequente, coloque o dobro do valor da posição anterior. Por
exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e
assim sucessivamente. Mostre o vetor em seguida. */

//fazer um array 10
//cada posição *2 do anterior

fun main(){
    println("Digite um numero")
    var vetorNumeros = IntArray(10)
    vetorNumeros[0] = readln().toInt()

    inserirNumerosVetor(vetorNumeros)
    mostrarArrays(vetorNumeros)

}
fun inserirNumerosVetor(vetorNumeros: IntArray){
    for (i in 1..9){
        vetorNumeros[i] = vetorNumeros[i-1]*2
    }
}

fun mostrarArrays(vetorNumeros: IntArray){
    var i=0
    while (i < vetorNumeros.size){
        println(vetorNumeros[i])
        i++
    }
}
