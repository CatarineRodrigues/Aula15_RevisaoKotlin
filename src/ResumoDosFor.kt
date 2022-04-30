fun main() {
    val nome = "Daniel"
    val arrayNomes = arrayListOf("Daniel", "Kate", "Thay")
    val range1 = 1..6

    range1.forEach { elemento ->
        println("Elemento: $elemento")
    }

    println()
    println("-----------")
    println()


    range1.forEachIndexed{index, elemento ->
        println("Índice: $index e Elemento: $elemento")
    }

    println()
    println("-----------")
    println()

    for (elemento in arrayNomes){
        println(elemento)
    }

    println()
    println("-----------")
    println()

    for (i in nome.indices){
        println(i)
    }

    println()
    println("-----------")
    println()

    for((i, e) in arrayNomes.withIndex()){
        println("indice: $i")
        println("elemento: $e")
    }

    println()
    println("-----------")
    println()

    for((i, e) in (3..7).withIndex()){
        println("indice: $i")
        println("elemento: $e")
    }
}