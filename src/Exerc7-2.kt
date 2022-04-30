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
7. Uma escola possui um determinado número de turmas. Crie um
algoritmo que leia a quantidade de turmas existentes na escola. Para
cada turma, leia a quantidade de alunos e, para cada aluno, leia a sua
média no semestre. Informe a média de cada uma das turmas. */

// qntidade variavel de turmas
// definir a qantidade de alunos de cada turma
// cada aluno = média

fun main() {
    println("Quantas turmas tem na escola?")
    val qntidadeTurmas = readln().toInt()
    var mediaTurma: Double = 0.0

    for (turma in 0 until qntidadeTurmas) {
        println("Na turma ${turma + 1} tem quantos alunos?")
        val qntidadeAlunos = readln().toInt()
        println("-----Sobre a Turma ${turma + 1}-----")

    }
}
/*        var mediaAluno = IntArray(qntidadeAlunos){ i ->
                mediaCadaAluno(qntidadeAlunos)
            }
        }

        println("A média da turma ${turma+1} foi de ${mediaTurma/qntidadeAlunos}")
        mediaTurma = 0.0
}

fun mediaCadaAluno (posicao: Int): Double{
    println("Digite a nota aluno")
    var nota = readln().toDouble()
    return nota
}

 */

//        mediaAluno.forEachIndexed { index, _ ->
//            println("Escreva a média que o aluno ${index+1} teve")
//            mediaAluno[index] = readln().toInt()
//            mediaTurma += mediaAluno[index]
//        }


//        mediaAluno.forEachIndexed { index, _ ->
//            println("Escreva a média que o aluno ${index+1} teve")
//            readln().toDouble() }

//        for (valor in media){
//            mediaTurma += valor
//        }


// vai ser um for dentro de outro for
//turma 1 - 10 alunos
//aluno 1 - média 10
