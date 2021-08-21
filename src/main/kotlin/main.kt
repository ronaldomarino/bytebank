fun main() {
    println("Bem vindo ao ByteBank")

    var contaRonaldo = Conta()
    contaRonaldo.titular = "Ronaldo"
    contaRonaldo.numero = 1000
    contaRonaldo.setSaldo(120.0)

    var contaDani = Conta()
    contaDani.titular = "Daniela"
    contaDani.numero = 1001
    contaDani.setSaldo(150.0)

    println(contaRonaldo.titular)
    println(contaRonaldo.numero)
    println(contaRonaldo.getSaldo())

    println(contaDani.titular)
    println(contaDani.numero)
    println(contaDani.getSaldo())

    //testaRepeticao()
    //testaCondicoes(saldo)

    println("Depositando na conta do Ronaldo")
    contaRonaldo.deposita(25.0)
    println("Saldo: ${contaRonaldo.getSaldo()}")

    println("Depositando na conta da Dani")
    contaDani.deposita(25.0)
    println("Saldo: ${contaDani.getSaldo()}")

    println("Sacando na conta do Ronaldo")
    contaRonaldo.saca(45.0)
    println("Saldo: ${contaRonaldo.getSaldo()}")

    println("Sacando na conta da Dani")
    contaDani.saca(146.2)
    println("Saldo: ${contaDani.getSaldo()}")

    println("Transferindo da conta da Dani para a conta do Ronaldo")
    if (contaDani.transfere(150.0, contaRonaldo)) {
        println("Transferência realizada com sucesso")
    } else {
        println("Transferência não rolou")
    }
    println("Saldo Dani: ${contaDani.getSaldo()}")
    println("Saldo Ronaldo: ${contaRonaldo.getSaldo()}")

}

class Conta() {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
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

    fun getSaldo(): Double {
        return this.saldo
    }

    fun setSaldo(valor: Double) {
        if (valor > 0) {
            this.saldo = valor
        }
    }
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaRonaldo = Conta()
    contaRonaldo.titular = "Ronaldo"
    var contaDani = Conta()
    contaDani.titular = "Dani"
    contaRonaldo.titular = "Ronaldo"

    println("Titular conta Ronaldo: ${contaRonaldo.titular}")
    println("Tsitular conta Dani: ${contaDani.titular}")

    println(contaRonaldo)
    println(contaDani)
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