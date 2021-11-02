fun main (){
    print("Hello world")
    val titular = "Alex"
    val numeroConta = 1000
    val saldo = 0.0

    println("Titular $titular")
    println("Numero da conta $numeroConta")
    println("Saldo da conta $saldo")

    testaCondicoes(saldo)
}
fun testaCondicoes (saldo: Double){
    when {
        saldo > 0.0 ->
            println("Conta é positiva")
        saldo == 0.0 ->
            println("Conta é neutra")
        else ->
            println("Conta é negativa")
    }
}