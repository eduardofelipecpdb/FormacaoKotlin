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