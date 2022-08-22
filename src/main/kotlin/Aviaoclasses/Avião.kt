package Aviaoclasses/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
fun main(){
    val Aviao = Aeronave(
      "Boig:1626",
      "2019",
      "B254P-19",
      "Air Construction ltda",
      "Lublin- Polonia",

    )
    println(Aviao.Modelo)
    println("Ano de Fabricação : ${Aviao.Ano}")
    println("Numero de serie da Aviaoclasses.Aeronave : ${Aviao.NumeroDeSerie} ")
    println("Fabricado Por : ${Aviao.Contrutora}")
    println("Local de fabricação: ${Aviao.Local} ")


}
