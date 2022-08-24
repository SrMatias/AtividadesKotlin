import atividadedia24.Animal

fun main() {

    class Cachorro : Animal("Rex",5){
        override fun emitirsom() {
            super.emitirsom()
            println("Au AU AU")


        }

    }
    class Cavalo : Animal("Epona", 7){

        override fun emitirsom() {
            super.emitirsom()
            println("IMM RÊ RÊ RÊÉÉNHI")
        }
    }
    class Priguiça : Animal("Wandeley", 2){
        override fun emitirsom() {
            super.emitirsom()
            println("hmmmmmmmmm")

        }

    }




var cachorro = Cachorro ()
    println("****Cachorro****")
   println (cachorro.nome)
   println (cachorro.idade)
    cachorro.correr()
    cachorro.emitirsom()

println()

var cavalo  = Cavalo()
    println("***Cavalo****")
   println( cavalo.nome )
   println( cavalo.idade)
    cavalo.correr()
    cavalo.emitirsom()

println()

 var priguiça = Priguiça()
    println("***Priguiça****")
    println( priguiça.nome)
    println( priguiça.idade)
    priguiça.emitirsom()
   priguiça.deitado()
}




