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
4. Uma loja de animais vende gatos e cachorros. Escreva um algoritmo que leia a
quantidade de animais da loja e, para cada animal, leia a informação do tipo do
animal (se é gato ou cachorro). Ao final, exiba a quantidade de animais que são
gatos e a quantidade de animais que são cachorros existentes na loja */

//gatos e cachorros
//criar um vetor para verificar o q é cada animal
//ler qntidade de animais
//classificar o q é cada animal

fun main(){
    println("Bem vindo à loja PETS \nInsira a quantidade de animais na loja ")
    val qntidade = readln().toInt()
//    val listaAnimais = ArrayList<String>(qntidade)
    println("Vamos cadastrar os animais da loja \n\nDigite 1 para Cachorro e 2 para Gato")
    classificandoAnimais(qntidade)
}

fun classificandoAnimais(qntidade: Int){
    var animal = 0
    var qntidadeCao = 0
    var qntidadeGato = 0

    for (i in 0 until qntidade){
        println("O ${i+1}º animal é ")
        animal = readln().toInt()
        if (animal == 1) {
//            listaAnimais.add("Cachorro")
            qntidadeCao += 1
        } else if (animal == 2) {
//            listaAnimais.add("Gato")
            qntidadeGato += 1
        } else {
            println("Número inválido")
        }
    }
    exibirQntidadeAnimais(qntidadeCao,qntidadeGato)
}

fun exibirQntidadeAnimais(qntidadeCao: Int, qntidadeGato: Int){
    println("A quantidade de Cachorros é $qntidadeCao e a quantidade de Gatos é de $qntidadeGato")
}