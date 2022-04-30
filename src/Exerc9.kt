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
9. Escreva um algoritmo que leia a quantidade de funcionários em uma
empresa e, para cada funcionário leia seu nome e seu tempo de
serviço (em meses). Se o funcionário possuir mais de 12 meses na
empresa, escreva a mensagem “<NOME>tem direito aférias”. Caso
contrário, escreva a mensagem “<NOME>não tem direito aférias”. Ao
final, exiba quantos funcionários possuem direito a férias e quantos
não possuem */
/*

 */
import kotlin.system.exitProcess

/*Escreva um algoritmo que leia a quantidade de funcionários em uma
empresa e, para cada funcionário leia seu nome e seu tempo de
serviço (em meses). Se o funcionário possuir mais de 12 meses na
empresa, escreva a mensagem “<NOME>tem direito a férias”. Caso
contrário, escreva a mensagem “<NOME>não tem direito a férias”. Ao
final, exiba quantos funcionários possuem direito a férias e quantos
não possuem*/

fun main() {
    menuu()
    while (true) {
        println("Digite a quantidade de funcionários:")
        var qtdFuncionarios = readln().toInt()
        var funcionarios = arrayOfNulls<String>(qtdFuncionarios)
        var tempoDeServico = arrayOfNulls<Int>(qtdFuncionarios)

        setInformacoes(funcionarios, tempoDeServico)

        opcoes(funcionarios, tempoDeServico)
    }
}

fun menuu() {
    println("|----  Bem vindo ao sistema de GeekCalc -----------|")
    println("|        Por favor, digite a opção desejada:           |")
    println("|------------------------------------------------------|")
    println("|--------------01 - Inserir dados ---------------------|")
    println("|--------------02 - Visualizar Informações-------------|")
    println("|--------------03 - Sair ------------------------------|")
    println("|------------------------------------------------------|")
}

fun setInformacoes(funcionarios: Array<String?>, tempo: Array<Int?>) {
    funcionarios.forEachIndexed { i, _ ->
        println("Digite o nome do ${i + 1}º funcionário:")
        funcionarios[i] = readln()

        println("Digite o tempo em meses de serviço do ${i + 1}º funcionário:")
        tempo[i] = readln().toInt()
    }
}

fun direitoAFerias(funcionarios: Array<String?>, tempo: Array<Int?>) {
    var contFerias = 0
    var contSDireito = 0
    println()
    println()
    println("|-------------Direito a férias-------------|")
    funcionarios.forEachIndexed { i, _ ->
        when {
            tempo[i]!! >= 12 -> {
                contFerias++
                println("O(A) funcionário(a) ${funcionarios[i]} tem direito a férias")
            }
            else -> {
                contSDireito++
                println("O(A) funcionário(a) ${funcionarios[i]} não tem direito a férias")
            }
        }
    }
    println()
    println()
    println("Quantidade de funcionários com direito a férias: $contFerias")
    println("Quantidade de funcionários sem direito a férias: $contSDireito")
    println()
}

fun opcoes(funcionarios: Array<String?>, tempo: Array<Int?>){
    println()
    println("|------------------------------------------------------|")
    println("|--------------01 - Inserir dados ---------------------|")
    println("|--------------02 - Visualizar Informações-------------|")
    println("|--------------03 - Sair ------------------------------|")
    println("|------------------------------------------------------|")
    val opcao = readln().toInt()

    when(opcao){
        1 -> {
            println("Inserir novos dados.")
            println()
        }
        2 -> {
            direitoAFerias(funcionarios, tempo)
            opcoes(funcionarios, tempo)
        }
        3 -> {
            println("Obrigado por utilizar nosso sitema.\nAté mais!")
            exitProcess(0)
        }
        else -> {
            println("Opção inválida!")
            opcoes(funcionarios, tempo)
        }
    }
}


/* código modificado do Luciano
fun main() {

    cadastrarFuncionario()
}
fun cadastrarFuncionario() {
    println("Quanfos funcionários")
    var nFuncionarios = readln().toInt()
    var funcionario = arrayOfNulls<String?>(nFuncionarios*2)
    var i: Int = 0
    while (i < funcionario.size) {
        println("Digite o nome")
        funcionario[i] = readln()
        i++
        println("Tempo de serviço")
        funcionario[i] = readln()
        i++
    }
    for (x in funcionario.indices) {
        println("${funcionario[x]}")
    }
}
 */