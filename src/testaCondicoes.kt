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