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
5. Crie um algoritmo que leia o primeiro nome do usuário e escreva uma
saudação para ele */

fun main(){
    println("Digite o seu nome")
    val nome = readln()
    saudacao(nome)
}

fun saudacao(usuario: String){
    println("Seja bem vindo $usuario!")
}