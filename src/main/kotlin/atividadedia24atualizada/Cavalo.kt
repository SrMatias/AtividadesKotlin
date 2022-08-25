package atividadedia24

class Cavalo(
    nome: String,
    idade: Int,
    var tipo :String

) : Animal(nome, idade)

{
    override fun correr() {
        println("Status: Correndo")
    }

    override fun emitirsom() {
        println("Som emetido:Pocoto Pocotó")
    }
fun exibir (){
    println("nome: $nome\n " +
            "Idade: $idade\n" +
            "Tipo: $tipo")
             emitirsom()
                 correr()

}
}