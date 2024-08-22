package ListaXP

class Ex02 {
    fun contarPalavras(texto: String): Int {
        // Separa o texto em palavras usando espaços como delimitador
        val palavras = texto.split(" ")

        // Conta o número de palavras
        return palavras.size
    }

    fun main() {
        print("Digite o parágrafo: ")
        val paragrafo = readLine() ?: "" // Lê a entrada do usuário

        val totalPalavras = contarPalavras(paragrafo)
        println("O parágrafo possui $totalPalavras palavras.")
    }
}