package Aviaoclasses

class Aeronave (

    val Modelo  : String,
    val Ano : String,
    val NumeroDeSerie:String,
    val Contrutora:String,
    val Local :String,


) {
    private val CompraDeAviao = mutableListOf<String>()


    fun Modelo() {
        println(Modelo)
    }

        fun Ano() {

            println(Ano)
        }

        fun NSerie() {
            println(NumeroDeSerie)
        }

        fun Contrutora() {
            println(Contrutora)

        }

        fun Local() {
            println(Local)
        }
    }

