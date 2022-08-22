class Clients (

    val nome : String,
    var endereco:String,
    var telefone:String,
    var compras:String,
    val Cpf: String,
    ){



    fun NomeCliente(){
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
}
