fun main(){
    println("Bem vindo ao ByteBank")

    for (i in 1..3) {
        val titular = "Ronaldo $i"
        val conta = 1000 + i
        var saldo = 120 * i / 3

        print("Titular: $titular")
        print(" - Conta: $conta")
        println(" - Saldo: $saldo;")
    }

    for (i in 5 downTo 1 step 2) {
        val titular = "Ronaldo Ms $i"
        val conta = 1000 + i
        var saldo = 120 * i / 3

        print("Titular: $titular")
        print(" - Conta: $conta")
        println(" - Saldo: $saldo;")
    }

    println("")

    var i = 1
    while(i <= 5) {
        val titular = "Ronaldo $i"
        val conta = 1000 + i
        var saldo = 120 * i / 3

        print("Titular: $titular")
        print(" - Conta: $conta")
        println(" - Saldo: $saldo;")
        i++
    }

    //testaCondicoes(saldo)

}

fun testaCondicoes(saldo: Double){

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