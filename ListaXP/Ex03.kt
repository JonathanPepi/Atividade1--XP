package ListaXP

import java.util.*

class Ex03 {

    data class Aluno(val nome: String, val notas: List<Double>) {
        fun calcularMedia(): Double {
            return notas.average()
        }

        fun estaAprovado(notaAprovacao: Double = 7.0): Boolean {
            return calcularMedia() >= notaAprovacao
        }
    }

    fun main() {
        val scanner = Scanner(System.`in`)
        val alunos = mutableListOf<Aluno>()

        print("Quantos alunos você deseja cadastrar? ")
        val numAlunos = scanner.nextInt()

        repeat(numAlunos) {
            print("Nome do aluno: ")
            val nome = scanner.next()

            print("Quantidade de notas: ")
            val numNotas = scanner.nextInt()

            val notas = List(numNotas) {
                print("Nota ${it + 1}: ")
                scanner.nextDouble()
            }

            alunos.add(Aluno(nome, notas))
        }

        println("\nResultados:")
        alunos.forEach { aluno ->
            println("Aluno: ${aluno.nome}")
            println("Média: ${aluno.calcularMedia()}")
            println("Aprovado: ${aluno.estaAprovado()}")
        }
    }
}