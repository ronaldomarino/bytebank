fun main(){
    println("Bem vindo ao ByteBank")

    val titular = "Ronaldo"
    val conta = 1000
    var saldo = 0.0

    saldo = 100.0

    saldo -= 100.1

    println("Titular: $titular")
    println("Conta: $conta")
    println("Saldo: $saldo")

    if (saldo > 0.0){
        println("Saldo é positivo")
    } else if(saldo == 0.0){
        println("Saldo é neutro")
    } else {
        println("Saldo é negativo")
    }

    when {
        saldo > 0.0 -> println("Saldo é positivo")
        saldo == 0.0 -> println("Saldo é neutro")
        else -> println("Saldo é negativo")
    }

}