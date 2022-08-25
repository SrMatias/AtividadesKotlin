package atividadedia24

abstract class Animal(
    var nome: String,
    var idade: Int
) {

    abstract fun correr()


   open fun emitirsom(){
        println("som")
    }

}