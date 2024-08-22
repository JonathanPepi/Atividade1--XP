package ListaXP

class Ex04 {

    fun main() {
        val nomes = mutableListOf<String>()

        println("Digite os nomes dos 10 alunos:")
        repeat(10) {
            print("Aluno ${it + 1}: ")
            nomes.add(readLine()!!)
        }

        // Ordenar os nomes em ordem alfabética
        nomes.sort()

        println("\nLista de alunos em ordem alfabética:")
        nomes.forEachIndexed { index, nome ->
            println("${index + 1}. $nome")
        }
    }
}