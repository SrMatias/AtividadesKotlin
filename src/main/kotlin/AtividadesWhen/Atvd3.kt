fun main(){

    print("Ola! Qual sua idade? ")
    val idade= readln().toInt()
    when(idade){
        in 10..14 -> print("Voce esta na categoria:INFANTIL")
        in 15..17 -> print("Voce esta na categoria : JUVENIL")
        in  18..25 -> print("Voce esta na categoria:ADULTO")

      else -> print("Infelizmente voce não se encaicha nas categorias disponiveis...")
    }








}