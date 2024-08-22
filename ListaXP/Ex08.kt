package ListaXP

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Ex08 {

    data class Produto(
        val nome: String,
        var quantidade: Int,
        val nivelMinimo: Int,
        val nivelMaximo: Int
    ) {
        private val historicoReposicoes = mutableListOf<Pair<String, Int>>()

        fun reporEstoque() {
            if (quantidade < nivelMinimo) {
                quantidade = nivelMaximo
                historicoReposicoes.add(Pair(dataAtual(), nivelMaximo))
                println("Estoque de $nome reposto para $nivelMaximo unidades em ${dataAtual()}.")
            } else {
                println("Estoque de $nome está acima do nível mínimo.")
            }
        }

        private fun dataAtual(): String {
            val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
            return LocalDate.now().format(formatter)
        }

        fun mostrarHistorico() {
            println("Histórico de reposições para $nome:")
            historicoReposicoes.forEach { (data, quantidade) ->
                println("- $data: $quantidade unidades")
            }
        }
    }

    fun main() {
        val produtos = mutableListOf<Produto>()

        repeat(5) {
            print("Nome do produto: ")
            val nome = readLine()!!
            print("Quantidade inicial: ")
            val quantidade = readLine()!!.toInt()
            print("Nível mínimo: ")
            val nivelMinimo = readLine()!!.toInt()
            print("Nível máximo: ")
            val nivelMaximo = readLine()!!.toInt()

            val produto = Produto(nome, quantidade, nivelMinimo, nivelMaximo)
            produtos.add(produto)
            produto.reporEstoque()
        }

        // Exemplo de consulta ao histórico de um produto
        produtos.first().mostrarHistorico()
    }
}