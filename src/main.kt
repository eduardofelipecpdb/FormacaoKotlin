fun main (){
    executaAcoesConta()
}

fun executaAcoesConta() {
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