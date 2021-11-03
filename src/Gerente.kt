class Gerente(nome: String,
              cpf: String,
              salario: Double,
              val senha: Int
              ) : Funcionario(nome, cpf, salario){

    override val bonificacao: Double
        get() {
            return salario * 0.1
        }

    fun autentica(senha: Int): Boolean{
        if(senha == this.senha)
            return true
        return false
    }
}