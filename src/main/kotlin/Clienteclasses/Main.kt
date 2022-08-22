
//1) Crie uma classe cliente e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias deste
//objeto e apresente as informações deste objeto no console.
fun main() {
    val Cliente1 = Clients(
        "Murilo Matias",
        "Gastão numero 60",
        "1195380-0000",
        "Geladeira,Fogão,Micro Ondas,Maquina de Lavar",
         "012.345.678.99",
    )
    println("Cpf do Clienteclasses.Cliente : ${Cliente1.Cpf}")
    println("CLIENTE : ${Cliente1.nome}")
    println("Residencia : ${Cliente1.endereco} ")
    println("Contato : ${Cliente1.telefone}")
    println("Produtos Compardos: ${Cliente1.compras} ")







}