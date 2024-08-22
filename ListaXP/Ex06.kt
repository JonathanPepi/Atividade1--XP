package ListaXP

class Ex06 {

    fun main() {
        val temperaturas = mutableListOf<Double>()

        repeat(30) { dia ->
            print("Digite a temperatura do dia ${dia + 1}: ")
            temperaturas.add(readLine()!!.toDouble())
        }

        val temperaturaMedia = temperaturas.average()
        val temperaturaMaxima = temperaturas.maxOrNull()!!
        val temperaturaMinima = temperaturas.minOrNull()!!

        val diaMaxima = temperaturas.indexOf(temperaturaMaxima) + 1
        val diaMinima = temperaturas.indexOf(temperaturaMinima) + 1

        println("\nResultados:")
        println("Temperatura média: $temperaturaMedia°C")
        println("Temperatura máxima: $temperaturaMaxima°C (dia $diaMaxima)")
        println("Temperatura mínima: $temperaturaMinima°C (dia $diaMinima)")
    }
}