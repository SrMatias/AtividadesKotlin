class Clients (

    val nome : String,
    var endereco:String,
    var telefone:String,
    var compras:String,
    val Cpf: String,
){

    private val _estoque = mutableListOf<String>()
    val estoque :List<String> = _estoque


    fun addCompra(compra: String){
        if(compra.isNotBlank()){
            _estoque.add(compra)
            println("Produto adicionado com sucesso!")
        }else{
            println("Produto Inválido")
        }
    }

    fun removeCompra(compra: String){
        if(estoque.contains(compra)){
            _estoque.remove(compra)
            println("Produto removido com sucesso!")
        }else{
            println("O produto $compra não existe na lista!")
        }
    }

    fun exibirCompras(){
        println("***Lista de Compras***\n")
        estoque.forEach {
            println(it)
        }
    }

    private fun checarDados(){
        if(nome.isBlank()){
            throw Exception("Cadastro feito de maneira incorreta!")
        }
    }

}