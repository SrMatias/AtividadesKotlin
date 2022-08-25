package atividadedia24

class Cachorro(
    nome: String,
    idade: Int,
    var raça : String
) : Animal(nome, idade) {

    override fun correr() {
        println("Status:Correndo")

    }

    override fun emitirsom() {
        println("Som emitido: Auauau")
    }

    fun abanar (){

        println("Status: Abanando o rabo")

    }

    fun exibir (){

        println("nome: $nome\n " +
                "Idade: $idade\n" +
                "Raça: $raça")
                emitirsom()
                correr()
                abanar()

    }

}