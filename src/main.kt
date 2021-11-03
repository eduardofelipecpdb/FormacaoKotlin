fun main (){
    var contaEduardo = Conta("Eduardo", 1234)
    var contaVendedor = Conta("José", 1235)

    contaEduardo.deposita(20.0)
    println("Saldo da conta de ${contaEduardo.titular}: ${contaEduardo.saldo}")

    if(contaEduardo.transfere(15, contaVendedor))
        println("Valor transferido com sucesso")

    if(contaEduardo.saca(5.0))
        println("Valor sacado com sucesso")

    testaCondicoes(contaEduardo)
}

class Conta(
        val titular: String,
        val numero: Int
){
    var saldo: Double = 0.0
        private set

    fun deposita(valor: Double){
        this.saldo += valor
    }
    fun saca(valor: Double): Boolean{
        if(this.saldo >= valor)
            this.saldo -= valor
        else
            return false
        return true
    }
    fun transfere(valor: Int, destino: Conta): Boolean{
        if(saldo >= valor){
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }
}

fun testaCondicoes (conta: Conta){
    when {
        conta.saldo > 0.0 ->
            println("Conta é positiva")
        conta.saldo == 0.0 ->
            println("Conta é neutra")
        else ->
            println("Conta é negativa")
    }
}