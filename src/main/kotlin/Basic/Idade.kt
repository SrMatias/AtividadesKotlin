fun main(args: Array<String>) {

    println("Olá! qual seu nome?")
  val nome= readln ()
  println("Muito prazer $nome")
  println("Qual a sua idade?")
  val idade= readln().toInt()
  println("Otimo! então voce nasceu em ${2022 - idade}")


}