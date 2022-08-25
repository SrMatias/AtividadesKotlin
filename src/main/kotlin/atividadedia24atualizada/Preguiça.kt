package atividadedia24

class Preguiça(
        nome: String,
        idade: Int,
    var habitat:String


    ) :Animal(nome,idade) {
    override fun correr() {
        println("Status: Deitada")
    }

    override fun emitirsom() {
        println("Som emitido:ZZZzzzzzzz")
    }
   fun acordar (){
       println("Priguiça de acordar")
   }
    fun exibir() {
        println(
            "nome: $nome\n " +
                    "Idade: $idade\n" +
                    "Habitat: $habitat"
        )
        emitirsom()
        correr()
        acordar()

    }
}