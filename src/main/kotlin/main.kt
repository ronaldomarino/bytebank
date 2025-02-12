fun main() {
    println("Bem vindo ao ByteBank")

    var contaRonaldo = Conta(titular = "Ronaldo", numero = 1000)
    contaRonaldo.deposita(365.0)

    var contaDani = Conta(numero = 1001, titular = "Daniela")
    contaDani.deposita(521.0)

    println(contaRonaldo.titular)
    println(contaRonaldo.numero)
    println(contaRonaldo.saldo)

    println(contaDani.titular)
    println(contaDani.numero)
    println(contaDani.saldo)

    //testaRepeticao()
    //testaCondicoes(saldo)

    println("Depositando na conta do Ronaldo")
    contaRonaldo.deposita(25.0)
    println("Saldo: ${contaRonaldo.saldo}")

    println("Depositando na conta da Dani")
    contaDani.deposita(25.0)
    println("Saldo: ${contaDani.saldo}")

    println("Sacando na conta do Ronaldo")
    contaRonaldo.saca(45.0)
    println("Saldo: ${contaRonaldo.saldo}")

    println("Sacando na conta da Dani")
    contaDani.saca(146.2)
    println("Saldo: ${contaDani.saldo}")

    println("Transferindo da conta da Dani para a conta do Ronaldo")
    if (contaDani.transfere(150.0, contaRonaldo)) {
        println("Transferência realizada com sucesso")
    } else {
        println("Transferência não rolou")
    }
    println("Saldo Dani: ${contaDani.saldo}")
    println("Saldo Ronaldo: ${contaRonaldo.saldo}")

}

class Conta(var titular: String, val numero: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }


}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJosefus = Conta("Josefus", 1002)
    var contaJulieta = Conta("Julieta", 1003)
    contaJulieta.titular = "Julieta"
    contaJosefus.titular = "Ronaldo"

    println("Titular conta Josefus: ${contaJosefus.titular}")
    println("Tsitular conta Julieta: ${contaJulieta.titular}")

    println(contaJosefus)
    println(contaJulieta)
}

fun testaRepeticao() {
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
    while (i <= 5) {
        val titular = "Ronaldo $i"
        val conta = 1000 + i
        var saldo = 120 * i / 3

        print("Titular: $titular")
        print(" - Conta: $conta")
        println(" - Saldo: $saldo;")
        i++
    }
}

fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("Saldo é positivo")
    } else if (saldo == 0.0) {
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