package ListaXP

class Ex01 {

    fun main(){
        print("Informe um número para verificar se é primo: ")
        val num = readln().toInt()
        var contagem = 0

        for (i in num downTo 1) {
            if (num % i == 0) contagem += 1
        }
        if (contagem > 2){
            println("O número não é primo!")
        }else{
            println("O número é primo!")
        }
    }
}
