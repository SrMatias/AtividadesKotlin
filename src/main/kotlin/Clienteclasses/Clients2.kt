package Clienteclasses

class Clients2 (

    val nome : String,
    var endereco:String,
    var telefone:String,
    var compras:String,
    val Cpf: String,
    ){

     private var estoque = arrayListOf<String>()


fun addCompra(compra: String){
    if(compra.isNotBlank()){
        estoque.add(compra)
        println("Produto adicionado com sucesso!")
    }else{
        println("Produto Inválido")
    }
}

fun removeCompra(compra: String){
    if(estoque.contains(compra)){
        estoque.remove(compra)
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

   /* fun NomeCliente(){
        println(nome)
    }
    fun EndereçoCliente(endereço: String){

        println("Endereço de entrega :")
    }
    fun Contato(){
        println("Telefone Para Contato :$telefone")
    }
    fun Compras(){
        println("Compras ja realizadas : $compras")

    }
    fun CpfCliente(){
        println( "Cpf do Clienteclasses.Cliente : $Cpf")
    }

*/
