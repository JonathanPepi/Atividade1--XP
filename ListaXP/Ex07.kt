package ListaXP

class Ex07 {

    class Voo(val numeroDoVoo: Int, val capacidade: Int) {
        private val assentos = BooleanArray(capacidade) { true }

        fun reservarAssento(assento: Int): Boolean {
            if (assento in 1..capacidade && assentos[assento - 1]) {
                assentos[assento - 1] = false
                return true
            }
            return false
        }

        fun verificarDisponibilidade(assento: Int): Boolean {
            return assento in 1..capacidade && assentos[assento - 1]
        }

        fun getQuantidadeAssentosDisponiveis(): Int {
            return assentos.count { it }
        }

        fun getQuantidadeAssentosIndisponiveis(): Int {
            return assentos.count { !it }
        }
    }

    fun main() {
        val voo = Voo(123, 100)

        while (true) {
            println("\nMenu:")
            println("1. Reservar assento")
            println("2. Verificar disponibilidade")
            println("3. Mostrar quantidade de assentos")
            println("0. Sair")
            print("Digite sua opção: ")

            val opcao = readLine()?.toIntOrNull() ?: 0

            when (opcao) {
                1 -> {
                    print("Digite o número do assento que deseja reservar: ")
                    val assento = readLine()?.toIntOrNull() ?: 0
                    if (voo.reservarAssento(assento)) {
                        println("Assento $assento reservado com sucesso!")
                    } else {
                        println("Assento indisponível ou inválido.")
                    }
                }

                2 -> {
                    print("Digite o número do assento que deseja verificar: ")
                    val assento = readLine()?.toIntOrNull() ?: 0
                    if (voo.verificarDisponibilidade(assento)) {
                        println("Assento $assento está disponível.")
                    } else {
                        println("Assento $assento está indisponível ou inválido.")
                    }
                }

                3 -> {
                    println("Assentos disponíveis: ${voo.getQuantidadeAssentosDisponiveis()}")
                    println("Assentos indisponíveis: ${voo.getQuantidadeAssentosIndisponiveis()}")
                }

                0 -> {
                    println("Programa encerrado.")
                    break
                }

                else -> {
                    println("Opção inválida.")
                }
            }
        }
    }
}